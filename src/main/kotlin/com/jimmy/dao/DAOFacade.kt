package com.jimmy.dao

import com.jimmy.models.Performance

interface DAOFacade {
    suspend fun allPerformances(): List<Performance>
//    suspend fun performance(id: Int): Performance?
//    suspend fun addNewPerformance(title: String, body: String): Performance?
//    suspend fun editPerformance(id: Int, title: String, body: String): Boolean
//    suspend fun deletePerformance(id: Int): Boolean
}