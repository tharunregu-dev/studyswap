package com.studyswap.controller;
import com.studyswap.dto.ApiResponse;import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/donations") public class DonationController {@PostMapping("/{bookId}/request") public ApiResponse<Void> request(@PathVariable Long bookId){return ApiResponse.ok("Donation request sent",null);}@PostMapping("/{id}/accept") public ApiResponse<Void> accept(@PathVariable Long id){return ApiResponse.ok("Donation accepted; delivery can be arranged",null);}}
