package com.AnO.PatentTrademarkManager.classes.Actions.PatentActions

import com.AnO.PatentTrademarkManager.intefaces.Action
import com.fasterxml.jackson.annotation.JsonTypeName
import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity

@Entity
@JsonTypeName("procurement_of_certificate")
data class P_ProcurementOfCertificateAction(
        private val type_id:String?=null,
        override var instruction_ref: UUID?=null,

        val date_procurement_instructed: LocalDateTime?=null,
        val application_no: String?=null,
        val invention_description: String?=null,
        val clerk_procuring: String?=null,
        val month_clerk_instructed: String?=null,
        val procurement_status: String?=null,
        val date_cert_procured: LocalDateTime?=null,
        val patent_registration_no: String?=null,
        val date_cert_procurement_due: LocalDateTime?=null,
        val month_cert_procurement_due: String?=null): Action()
/*
ProcurementOfCertificateAction {
date_procurement_instructed:
application_no:
invention_description:
clerk_procuring:
month_clerk_instructed:
procurement_status:
date_cert_procured:
patent_regtn_no:
date_cert_procurement_due:
month_cert_procurement_due:
}


*/