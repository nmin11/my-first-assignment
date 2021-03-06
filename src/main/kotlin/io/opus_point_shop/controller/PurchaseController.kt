package io.opus_point_shop.controller

import io.opus_point_shop.service.PurchaseService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class PurchaseController (private val purchaseService: PurchaseService) {
    @PostMapping("/purchase-by-money")
    fun purchaseByMoney(@RequestParam customerId: Long): ResponseEntity<Any> {
        return purchaseService.purchaseByMoney(customerId)
    }

    @PostMapping("/purchase-by-point")
    fun purchaseByPoint(@RequestParam customerId: Long): ResponseEntity<Any> {
        return purchaseService.purchaseByPoint(customerId)
    }
}