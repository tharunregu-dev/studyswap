package com.studyswap.dto;
import com.studyswap.entity.ListingType;import jakarta.validation.constraints.*;import java.math.BigDecimal;
public record BookRequest(@NotBlank String title,@NotBlank String author,@NotNull ListingType listingType,BigDecimal sellingPrice,BigDecimal rentalPrice,BigDecimal securityDeposit,String subject,String city){}
