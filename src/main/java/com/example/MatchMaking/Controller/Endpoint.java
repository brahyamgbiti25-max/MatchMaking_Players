package com.example.MatchMaking.Controller;

import com.example.MatchMaking.Service.EndpoitServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prove/")
public class Endpoint {
    @Autowired
    private EndpoitServe endpoitServe;
    @PostMapping("player/{id}/{skill}")
    public String sendFronUser(@PathVariable Long id,@PathVariable Float skill){
        stressTestQueue(id,skill);
        //endpoitServe.addPlayerToQueue(id,skill);
        return "";
    }
    public void  stressTestQueue(Long id,Float skill){
        for(long i=1 ;i<50;i++){
            id=i;
            Long finalId = id;
            new Thread(()->{
                endpoitServe.addPlayerToQueue(finalId,skill);
            }).start();
        }


    }
    @GetMapping("state")
    public String matchFound(@RequestParam String id){

        return "";
    }

}
