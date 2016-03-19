package xyz.luan.chatbot;

import io.yawp.commons.http.annotation.GET;
import io.yawp.repository.actions.Action;

import java.util.Map;

public class MainAction extends Action<Main> {

    @GET
    public String chat(Map<String, String> m) {
       return process(m.get("message"));
    }

    private String process(String t) {
        return "hello, world: " + t;
    }
}

