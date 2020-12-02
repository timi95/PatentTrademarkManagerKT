package com.AnO.PatentTrademarkManager.repositories.ActionRepositories

import com.AnO.PatentTrademarkManager.classes.Actions.PatentActions.SearchAction
import org.springframework.data.jpa.repository.JpaRepository

interface SearchActionRepository: JpaRepository<SearchAction,Long> {
}