package com.ak47.spring5

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication(scanBasePackages = arrayOf("com.ak47.spring5"))
class KotlinApp


fun main(args: Array<String>) {
    SpringApplication.run(KotlinApp::class.java, *args)
}