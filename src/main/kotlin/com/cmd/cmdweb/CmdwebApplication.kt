package com.cmd.cmdweb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CmdwebApplication

fun main(args: Array<String>) {
	runApplication<CmdwebApplication>(*args)
}
