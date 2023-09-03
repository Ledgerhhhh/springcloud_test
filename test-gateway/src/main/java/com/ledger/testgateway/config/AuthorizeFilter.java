package com.ledger.testgateway.config;

import com.ledger.testcommon.exception.AppExceptionCodeMsg;
import com.ledger.testcommon.exception.KnowException;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;

@Component
public class AuthorizeFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        ServerHttpRequest request = exchange.getRequest();
//
//        HttpHeaders headers = request.getHeaders();
//        List<String> authorization = headers.get("Authorization");
//        if(authorization != null && authorization.get(0).equals("ledger")){
//            return chain.filter(exchange);
//        }
//        throw new KnowException(AppExceptionCodeMsg.USER_AUTHENTICATION_NO_TOKEN);
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
