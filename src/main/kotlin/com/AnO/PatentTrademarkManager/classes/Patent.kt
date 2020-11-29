package com.AnO.PatentTrademarkManager.classes

import com.AnO.PatentTrademarkManager.intefaces.Action
import com.AnO.PatentTrademarkManager.intefaces.Instruction
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Patent(
        @Id @GeneratedValue val id:Long?=null,

        val our_reference_number: String?=null,
        val client_id:String?=null,
        val clients_reference_number:String?=null,
        val curent_instruction:String?=null,
        val date_of_instruction: LocalDateTime?=null,
        val name_of_client:String?=null,
        val clients_address: String?=null,
        val clients_contact_person:String?=null,
        val name_of_patentee:String?=null,
        val patentees_address:String?=null,
        val date_instruction_received: LocalDateTime?=null,
        val lawyer_responsible:String?=null,
        val invention_description:String?=null,
        val patent_registration_number:String?=null,
        val convention_country:String?=null,
        val current_status:String?=null,
        val certificate_procurement_due_date:LocalDateTime?=null,
        val month_certificate_procurement_due:String?=null,
        val date_outgoing_abuja_schedule:LocalDateTime?=null,
        val date_incoming_abuja_schedule:LocalDateTime?=null,
        val date_completed_job_received: LocalDateTime?=null,
        val official_fee: String?=null,
        val facilitation: String?=null,
        val incentive_due_clerk: String?=null,
        val clerk_responsible: String?=null,
        val month_incoming_abuja_schedule: String?=null,
        val month_outgoing_abuja_schedule: String?=null,
        val filing_receipt_status: String?=null,
        val applicable_service_charge: String?=null,
        val quickteller_fee: String?=null ):Instruction