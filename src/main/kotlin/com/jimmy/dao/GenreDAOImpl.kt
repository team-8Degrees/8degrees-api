package com.jimmy.dao

import com.jimmy.models.*
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.selectAll

class GenreDAOImpl : GenreDAOFacade {
    private fun resultRowToGenre(row: ResultRow) = GenreDAO(
        code = row[Genres.code],
        value = row[Genres.value],
    )

    override suspend fun allGenres(): List<GenreDAO> = dbQuery {
        Genres.selectAll().map(::resultRowToGenre)
    }
}