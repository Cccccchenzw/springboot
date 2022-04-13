package czw.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MySchedule {
//    在当前任务执行结束1秒后开启另一个任务，fixedDelay控制方法执行的间隔时间，是以上一次方法执行完开始算起，
//    如上一次方法执行阻塞住了，那么直到上一次执行完，并间隔给定的时间后，执行下一次。
    @Scheduled(fixedDelay = 1000)
    public void fixedDelay(){
//        System.out.println("fixedDelay:" + new Date());
    }
//    在当前任务执行2秒后,开启另一个定时任务，fixedRate是按照一定的速率执行，是从上一次方法执行开始的时间算起，
//    如果上一次方法阻塞住了，下一次也是不会执行，但是在阻塞这段时间内累计应该执行的次数，当不再阻塞时，一下子把这些全部执行掉，而后再按照固定速率继续执行。
    @Scheduled(fixedRate = 2000)
    public void fixedRate(){
//        System.out.println("fixedRate:" + new Date());
    }
//    在当前任务执行2秒后,开启另一个定时任务，initialDelay 。如： @Scheduled(initialDelay = 1000,fixedRate = 2000
//  这个定时器就是在上一个的基础上加了一个initialDelay = 1000 意思就是在容器启动后,延迟1秒后再执行一次定时器,以后每2秒再执行一次该定时器。
    @Scheduled(initialDelay = 1000, fixedRate = 2000)
    public void initialDelay(){
//        System.out.println("initialDelay:" + new Date());
    }
//    cron = "0 * * * * ?"该定时任务每分钟执行一次，cron表达式可以定制化执行任务，但是执行的方式是与fixedDelay相近的，也是会按照上一次方法结束时间开始算起。
    @Scheduled(cron = "0 * * * * ?")
    public void cron(){
        System.out.println("cron:" + new Date());
    }
}
