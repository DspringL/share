package design.part2.singleton.plan3;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

class SingletonTest {

	@Test
	void test() {
		Set<Singleton> singletons = new HashSet<>();
		ExecutorService executorService = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue<>());
		for (int i = 0; i < 100; i++) {
			executorService.submit(new Runnable() {
				@Override
				public void run() {
					Singleton instance = Singleton.getInstance();
					singletons.add(instance);
					try {
						Thread.sleep(new Random().nextInt(1)*1000);
					} catch (Exception e) {
					}
				}
			});
		}
        //关闭线程池，等待任务执行完毕
		executorService.shutdown();
        try {
            //阻塞线程，直到所有任务都完成执行或达到指定的超时
        	executorService.awaitTermination(60, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            //强制关闭所有线程，不等待执行
        	executorService.shutdownNow();
            //中断当前线程
            Thread.currentThread().interrupt();
        }
        assertTrue(singletons.size()==1);
	}

}
