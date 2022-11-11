package hello.advanced.trace.strategy;

import hello.advanced.trace.strategy.code.template.Callback;
import hello.advanced.trace.strategy.code.template.TimeLogTemplate;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TemplateCallbackTest {
    /**
     * ���ø� �ݹ� ���� - �͸� ���� Ŭ����
     */
    @Test
    void callbackV1() {
        TimeLogTemplate template = new TimeLogTemplate();
        template.execute(new Callback() {
            @Override
            public void call() {
                log.info("����Ͻ� ����1 ����");
            }
        });
        template.execute(new Callback() {
            @Override
            public void call() {
                log.info("����Ͻ� ����2 ����");
            }
        });
    }

    /**
     * ���ø� �ݹ� ���� - ����
     */
    @Test
    void callbackV2() {
        TimeLogTemplate template = new TimeLogTemplate();
        template.execute(() -> log.info("����Ͻ� ����1 ����"));
        template.execute(() -> log.info("����Ͻ� ����2 ����"));
    }
}