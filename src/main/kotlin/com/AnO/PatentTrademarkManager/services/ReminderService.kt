package com.AnO.PatentTrademarkManager.services

import com.AnO.PatentTrademarkManager.classes.Reminder
import com.AnO.PatentTrademarkManager.classes.Utility.Utility.pageRequest
import com.AnO.PatentTrademarkManager.repositories.ReminderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Sort
import org.springframework.http.codec.ServerSentEvent
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import java.time.Duration
import java.time.LocalTime
import java.util.*


@Service
class ReminderService {
    @Autowired
    lateinit var reminderRepository: ReminderRepository

//    Reminder CRUD
    fun createReminder(reminder: Reminder): Reminder {
    try {
        return reminderRepository.save(reminder) }
        catch (e: Exception){throw(e)}
    }

    fun getReminders(page: Int? = 1,
                     size: Int? = 10,
                     direction: Sort.Direction,
                     sort_property: String): Page<Reminder> =
            try { reminderRepository.findAll(pageRequest(page, size, direction, sort_property))}
            catch (e: Exception){throw e}

    fun getReminder(id: UUID) =
            try { reminderRepository.findById(id).get() }
            catch (e: Exception){throw e}

    fun updateReminder(id: UUID, reminder: Reminder) =
            try { reminderRepository.save(reminder.copy(id = id)) }
            catch (e: Exception){throw e}

    fun deleteReminder(id: UUID) =
            try { reminderRepository.deleteById(id) }
            catch (e: Exception){ throw e}


    //Streams

    fun remindersEvent(): Flux<ServerSentEvent<List<Reminder>>>? {
        return Flux.interval(Duration.ofSeconds(1))
                .map { sequence: Long ->
                    ServerSentEvent.builder<List<Reminder>>()
                            .id(sequence.toString())
                            .event("periodic-event")
                            .data(reminderRepository.findAll())
                            .build()
                }
    }
}