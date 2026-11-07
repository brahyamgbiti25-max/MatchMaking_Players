package com.example.MatchMaking.Servicemlpm;

import com.example.MatchMaking.Models.Request.Player;
import com.example.MatchMaking.Service.EndpoitServe;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@Service
public class EndpointServelmpl implements EndpoitServe {
    private final Queue<Player> queue=new ConcurrentLinkedQueue<>();

    /*@Scheduled(fixedRate = 3000)
    public  void evaluateQueue(){
        if(queue.size()<2) return;
        Player player1=queue.poll();
        Player player2=queue.poll();
    }*/


    @Override
    public void addPlayerToQueue(Long id, Float skill) {
        Player newPlayer=new Player(id,skill,System.currentTimeMillis());
        queue.add(newPlayer);
        System.out.println("Player added! Total in queue: " + queue.size());

    }
    @Scheduled(fixedRate = 3000)
    public void evaluateQueue() {
        System.out.println("there is no user");
        if(queue.size()<2) return;
        Player player1=queue.poll();
        Player player2=queue.poll();
        if(player1!=null && player2 !=null){
            System.out.println("\">>> MATCH FOUND between Player " + player1.getId() + " and Player " + player2.getId());
        }else {
            System.out.println("there is no user");
        }
    }


}
