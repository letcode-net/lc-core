package net.letcode.core.boot.support.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Import;
import net.letcode.core.boot.support.processor.LcBootBeanPostProcessor;

/**
 * 启用 LetCode-SpringBoot 功能模块
 * @author LetCode
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({
        LcBootBeanPostProcessor.class
})
public @interface EnableLcBoot {
}
