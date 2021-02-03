package com.AnO.PatentTrademarkManager.classes.Actions.TrademarkActions

import com.AnO.PatentTrademarkManager.intefaces.Action
import com.fasterxml.jackson.annotation.JsonTypeName
import java.time.LocalDateTime
import javax.persistence.Entity

@Entity
@JsonTypeName("change_of_address")
data class T_ChangeOfAddressAction(
        val date_instruction: LocalDateTime?=null,
        val date_instruction_concluded: LocalDateTime?=null,
        val date_outgoing_abuja_schedule: LocalDateTime?=null,
        val date_incoming_abuja_schedule: LocalDateTime?=null,

        val new_address_of_proprietor: String?=null,
        val new_name_of_proprietor: String?=null,
        val official_fee_change_name:String?=null,
        val official_fee_change_address:String?=null,
        val status_change_of_name:String?=null,
        val status_change_of_address:String?=null): Action()

/*
T_change_name_address_action:any = {
    change_of_address_instruction_date: '',
    change_of_name_instruction_date: '',
    date_received_change_of_address_certificate: '',
    date_received_change_of_name_certificate: '',
    new_address_of_pptr:
    new_name_of_pptr:
    official_fee_change_name:
    official_fee_change_address:
    status_change_of_name:
    status_change_of_address:
};
 */