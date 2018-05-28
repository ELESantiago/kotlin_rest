package com.inusualsoft.point_of_sale.config

val SIGN_UP_URL = "/api/user/sign-up"
val SECRET = "SecretKeyToGenJWTs"
val TOKEN_PREFIX = "Bearer "
val HEADER_STRING = "Authorization"
val EXPIRATION_TIME: Long = 864_000_000 // 10 days