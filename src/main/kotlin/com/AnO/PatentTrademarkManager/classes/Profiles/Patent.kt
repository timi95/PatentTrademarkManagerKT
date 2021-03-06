package com.AnO.PatentTrademarkManager.classes.Profiles

import com.AnO.PatentTrademarkManager.classes.Image
import com.AnO.PatentTrademarkManager.interfaces.Action
import com.AnO.PatentTrademarkManager.interfaces.Instruction
import com.fasterxml.jackson.annotation.JsonTypeName
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@JsonTypeName("patent")
data class Patent(
        @Id @GeneratedValue override val id: UUID?=null,
        override val type_id:String?=null,
        @OneToMany(fetch = FetchType.LAZY, cascade = arrayOf(CascadeType.ALL), orphanRemoval = true)
        override val action_list: MutableList<Action>?= mutableListOf<Action>(),
        @OneToMany(cascade = arrayOf(CascadeType.ALL), orphanRemoval = true)
        override val image_list: MutableList<Image>?=mutableListOf(),

        val patent_title: String?=null,
        val registration_date: LocalDateTime?=null,
        val invention_title: String?=null,
        val application_number: String?=null,
        val patentee_name: String?=null,
        val patentee_address: String?=null,

        val our_reference_number: String?=null,
        val client_id: String?=null,
        val clients_reference_number: String?=null,
        val current_instruction: String?=null,
        val date_of_instruction: LocalDateTime?=null,
        val name_of_client: String?=null,
        val clients_address: String?=null,
        val clients_contact_person:String?=null,
        val date_instruction_received: LocalDateTime?=null,
        val lawyer_responsible: String?=null,
        val invention_description: String?=null,
        val patent_registration_number: String?=null,
        val convention_country: String?=null,
        val current_status: String?=null,
        val certificate_procurement_due_date: LocalDateTime?=null,
        val month_certificate_procurement_due: String?=null,
        val date_outgoing_abuja_schedule: LocalDateTime?=null,
        val date_incoming_abuja_schedule: LocalDateTime?=null,
        val date_completed_job_received: LocalDateTime?=null,
        val official_fee: String?=null,
        val facilitation: String?=null,
        val incentive_due_clerk: String?=null,
        val clerk_responsible: String?=null,
        val month_incoming_abuja_schedule: String?=null,
        val month_outgoing_abuja_schedule: String?=null,
        val filing_receipt_status: String?=null,
        val applicable_service_charge: String?=null,
        val quickteller_fee: String?=null, ): Instruction()