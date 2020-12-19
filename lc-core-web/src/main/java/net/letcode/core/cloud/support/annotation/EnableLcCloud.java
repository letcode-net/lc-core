package net.letcode.core.cloud.support.annotation;

import net.letcode.core.cloud.support.processor.LcCloudBeanPostProcessor;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 启用 LetCode-SpringCloud 功能模块
 * @author LetCode
 * @since 1.0
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({
        LcCloudBeanPostProcessor.class
})
public @interface EnableLcCloud {
}
