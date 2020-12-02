package com.AnO.PatentTrademarkManager.classes.Actions.PatentActions

import com.AnO.PatentTrademarkManager.classes.Patent
import com.AnO.PatentTrademarkManager.intefaces.Action
import com.fasterxml.jackson.annotation.JsonTypeName
import javax.persistence.*

@Entity
@JsonTypeName("search_action")
data class SearchAction(val instruction_id:Long?=null, private val type_id:String="search_action"): Action()