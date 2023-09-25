package com.tistory.tech.gyutech.organization

class Fund(
    val code: String,
    val name: String,
    var team: Team,
) {
    fun changeTeam(newTeam: Team) {
        this.team = newTeam
    }
}