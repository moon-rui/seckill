package org.seckill.exception;

/**
 * 秒杀相关业务异常
 * @author LRui
 *
 */
@SuppressWarnings("serial")
public class SeckillException extends RuntimeException{

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }

    public SeckillException(String message) {
        super(message);
    }

}
