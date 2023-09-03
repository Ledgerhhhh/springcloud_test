package com.ledger.testfeignapi.client;

import com.ledger.testfeignapi.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "test-user")
public interface userClient {
    @GetMapping("/user/getUser")
    List<User> getUser();

}
