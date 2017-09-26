/*
 * Copyright (C) 2017.
 * 用于配置信息
 * 重庆青沃科技有限公司 版权所有
 * Copyright © 2017.  CqingWo Systems Incorporated. All rights reserved.
 */

package com.cqwo.core.helper;

import java.util.Collection;
import java.util.Map;

/**
 * 断言工具类，用于检查方法的参数。该类copy自Spring框架。并做了些许修改，使其不再依赖于StringUtils,ObjectUtils,
 * CollectionUtils这三个类。
 * 
 * @version 1.0
 * @since 1.0
 */
public abstract class AssertHelper {

    /**
     * Assert a boolean expression, throwing
     * <code>IllegalArgumentException</code> if the test result is
     * <code>false</code>.
     * 
     * <pre class="code">
     * Assert.isTrue(i &gt; 0, &quot;The value must be greater than zero&quot;);
     * </pre>
     * 
     * @param expression a boolean expression
     * @param message the exception message to use if the assertion fails
     * @throws IllegalArgumentException if expression is <code>false</code>
     */
    public static void isTrue(boolean expression, String message) {
        if (!expression) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert a boolean expression, throwing
     * <code>IllegalArgumentException</code> if the test result is
     * <code>false</code>.
     * 
     * <pre class="code">
     * Assert.isTrue(i &gt; 0);
     * </pre>
     * 
     * @param expression a boolean expression
     * @throws IllegalArgumentException if expression is <code>false</code>
     */
    public static void isTrue(boolean expression) {
        isTrue(expression, "[Assertion failed] - this expression must be true");
    }

    /**
     * Assert that an object is <code>null</code> .
     * 
     * <pre class="code">
     * Assert.isNull(value, &quot;The value must be null&quot;);
     * </pre>
     * 
     * @param object the object to check
     * @param message the exception message to use if the assertion fails
     * @throws IllegalArgumentException if the object is not <code>null</code>
     */
    public static void isNull(Object object, String message) {
        if (object != null) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that an object is <code>null</code> .
     * 
     * <pre class="code">
     * Assert.isNull(value);
     * </pre>
     * 
     * @param object the object to check
     * @throws IllegalArgumentException if the object is not <code>null</code>
     */
    public static void isNull(Object object) {
        isNull(object, "[Assertion failed] - the object argument must be null");
    }

    /**
     * Assert that an object is not <code>null</code> .
     * 
     * <pre class="code">
     * Assert.notNull(clazz, &quot;The class must not be null&quot;);
     * </pre>
     * 
     * @param object the object to check
     * @param message the exception message to use if the assertion fails
     * @throws IllegalArgumentException if the object is <code>null</code>
     */
    public static void notNull(Object object, String message) {
        if (object == null) {
            throw new IllegalArgumentException(message);
        }
    }
    public static void notNull(String str, String message) {
        if (str == null) {
            throw new IllegalArgumentException(message);
        }
    }
    /**
     * Assert that an object is not <code>null</code> .
     * 
     * <pre class="code">
     * Assert.notNull(clazz);
     * </pre>
     * 
     * @param object the object to check
     * @throws IllegalArgumentException if the object is <code>null</code>
     */
    public static void notNull(Object object) {
        notNull(object, "[Assertion failed] - this argument is required; it must not be null");
    }

    /**
     * Assert that the given String is not empty; that is, it must not be
     * <code>null</code> and not the empty String.
     * 
     * <pre class="code">
     * Assert.hasLength(name, &quot;Name must not be empty&quot;);
     * </pre>
     * 
     * @param text the String to check
     * @param message the exception message to use if the assertion fails
     * @see StringUtils#hasLength
     */
    public static void hasLength(String text, String message) {
        if (text == null || text.length() <= 0) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that the given String is not empty; that is, it must not be
     * <code>null</code> and not the empty String.
     * 
     * <pre class="code">
     * Assert.hasLength(name);
     * </pre>
     * 
     * @param text the String to check
     * @see StringUtils#hasLength
     */
    public static void hasLength(String text) {
        hasLength(text,
                "[Assertion failed] - this String argument must have length; it must not be null or empty");
    }

    /**
     * Assert that the given String has valid text content; that is, it must not
     * be <code>null</code> and must contain at least one non-whitespace
     * character.
     * 
     * <pre class="code">
     * Assert.hasText(name, &quot;'name' must not be empty&quot;);
     * </pre>
     * 
     * @param text the String to check
     * @param message the exception message to use if the assertion fails
     * @see StringUtils#hasText
     */
    public static void hasText(String text, String message) {
        hasLength(text);

        boolean result = false;
        int strLen = text.length();
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(text.charAt(i))) {
                result = true;
                break;
            }
        }

        if (!result) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that the given String has valid text content; that is, it must not
     * be <code>null</code> and must contain at least one non-whitespace
     * character.
     * 
     * <pre class="code">
     * Assert.hasText(name, &quot;'name' must not be empty&quot;);
     * </pre>
     * 
     * @param text the String to check
     * @see StringUtils#hasText
     */
    public static void hasText(String text) {
        hasText(text,
                "[Assertion failed] - this String argument must have text; it must not be null, empty, or blank");
    }

    /**
     * Assert that the given text does not contain the given substring.
     * 
     * <pre class="code">
     * Assert.doesNotContain(name, &quot;rod&quot;, &quot;Name must not contain 'rod'&quot;);
     * </pre>
     * 
     * @param textToSearch the text to search
     * @param substring the substring to find within the text
     * @param message the exception message to use if the assertion fails
     */
    public static void doesNotContain(String textToSearch, String substring, String message) {
        hasLength(textToSearch);
        hasLength(substring);
        if (textToSearch.indexOf(substring) != -1) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that the given text does not contain the given substring.
     * 
     * <pre class="code">
     * Assert.doesNotContain(name, &quot;rod&quot;);
     * </pre>
     * 
     * @param textToSearch the text to search
     * @param substring the substring to find within the text
     */
    public static void doesNotContain(String textToSearch, String substring) {
        doesNotContain(textToSearch, substring,
                "[Assertion failed] - this String argument must not contain the substring ["
                        + substring + "]");
    }

    /**
     * Assert that an array has elements; that is, it must not be
     * <code>null</code> and must have at least one element.
     * 
     * <pre class="code">
     * Assert.notEmpty(array, &quot;The array must have elements&quot;);
     * </pre>
     * 
     * @param array the array to check
     * @param message the exception message to use if the assertion fails
     * @throws IllegalArgumentException if the object array is <code>null</code>
     *             or has no elements
     */
    public static void notEmpty(Object[] array, String message) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that an array has elements; that is, it must not be
     * <code>null</code> and must have at least one element.
     * 
     * <pre class="code">
     * Assert.notEmpty(array);
     * </pre>
     * 
     * @param array the array to check
     * @throws IllegalArgumentException if the object array is <code>null</code>
     *             or has no elements
     */
    public static void notEmpty(Object[] array) {
        notEmpty(array,
                "[Assertion failed] - this array must not be empty: it must contain at least 1 element");
    }

    /**
     * Assert that an array has no null elements. Note: Does not complain if the
     * array is empty!
     * 
     * <pre class="code">
     * Assert.noNullElements(array, &quot;The array must have non-null elements&quot;);
     * </pre>
     * 
     * @param array the array to check
     * @param message the exception message to use if the assertion fails
     * @throws IllegalArgumentException if the object array contains a
     *             <code>null</code> element
     */
    public static void noNullElements(Object[] array, String message) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    throw new IllegalArgumentException(message);
                }
            }
        }
    }

    /**
     * Assert that an array has no null elements. Note: Does not complain if the
     * array is empty!
     * 
     * <pre class="code">
     * Assert.noNullElements(array);
     * </pre>
     * 
     * @param array the array to check
     * @throws IllegalArgumentException if the object array contains a
     *             <code>null</code> element
     */
    public static void noNullElements(Object[] array) {
        noNullElements(array, "[Assertion failed] - this array must not contain any null elements");
    }

    /**
     * Assert that a collection has elements; that is, it must not be
     * <code>null</code> and must have at least one element.
     * 
     * <pre class="code">
     * Assert.notEmpty(collection, &quot;Collection must have elements&quot;);
     * </pre>
     * 
     * @param collection the collection to check
     * @param message the exception message to use if the assertion fails
     * @throws IllegalArgumentException if the collection is <code>null</code>
     *             or has no elements
     */
    
    @SuppressWarnings("rawtypes")
	public static void notEmpty(Collection collection, String message) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that a collection has elements; that is, it must not be
     * <code>null</code> and must have at least one element.
     * 
     * <pre class="code">
     * Assert.notEmpty(collection, &quot;Collection must have elements&quot;);
     * </pre>
     * 
     * @param collection the collection to check
     * @throws IllegalArgumentException if the collection is <code>null</code>
     *             or has no elements
     */
    
    @SuppressWarnings("rawtypes")
	public static void notEmpty(Collection collection) {
        notEmpty(collection,
                "[Assertion failed] - this collection must not be empty: it must contain at least 1 element");
    }

    /**
     * Assert that a Map has entries; that is, it must not be <code>null</code>
     * and must have at least one entry.
     * 
     * <pre class="code">
     * Assert.notEmpty(map, &quot;Map must have entries&quot;);
     * </pre>
     * 
     * @param map the map to check
     * @param message the exception message to use if the assertion fails
     * @throws IllegalArgumentException if the map is <code>null</code> or has
     *             no entries
     */

    @SuppressWarnings("rawtypes")
	public static void notEmpty(Map map, String message) {
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that a Map has entries; that is, it must not be <code>null</code>
     * and must have at least one entry.
     * 
     * <pre class="code">
     * Assert.notEmpty(map);
     * </pre>
     * 
     * @param map the map to check
     * @throws IllegalArgumentException if the map is <code>null</code> or has
     *             no entries
     */

    @SuppressWarnings("rawtypes")
	public static void notEmpty(Map map) {
        notEmpty(map,
                "[Assertion failed] - this map must not be empty; it must contain at least one entry");
    }

    /**
     * Assert that the provided object is an instance of the provided class.
     * 
     * <pre class="code">
     * Assert.instanceOf(Foo.class, foo);
     * </pre>
     * 
     * @param clazz the required class
     * @param obj the object to check
     * @throws IllegalArgumentException if the object is not an instance of
     *             clazz
     * @see Class#isInstance
     */
   
    @SuppressWarnings("rawtypes")
	public static void isInstanceOf(Class clazz, Object obj) {
        isInstanceOf(clazz, obj, "");
    }

    /**
     * Assert that the provided object is an instance of the provided class.
     * 
     * <pre class="code">
     * Assert.instanceOf(Foo.class, foo);
     * </pre>
     * 
     * @param type the type to check against
     * @param obj the object to check
     * @param message a message which will be prepended to the message produced
     *            by the function itself, and which may be used to provide
     *            context. It should normally end in a ": " or ". " so that the
     *            function generate message looks ok when prepended to it.
     * @throws IllegalArgumentException if the object is not an instance of
     *             clazz
     * @see Class#isInstance
     */
 
    @SuppressWarnings("rawtypes")
	public static void isInstanceOf(Class type, Object obj, String message) {
        notNull(type, "Type to check against must not be null");
        if (!type.isInstance(obj)) {
            throw new IllegalArgumentException(message + "Object of class ["
                    + (obj != null ? obj.getClass().getName() : "null")
                    + "] must be an instance of " + type);
        }
    }

    /**
     * Assert that <code>superType.isAssignableFrom(subType)</code> is
     * <code>true</code>.
     * 
     * <pre class="code">
     * Assert.isAssignable(Number.class, myClass);
     * </pre>
     * 
     * @param superType the super type to check
     * @param subType the sub type to check
     * @throws IllegalArgumentException if the classes are not assignable
     */
   
    @SuppressWarnings("rawtypes")
	public static void isAssignable(Class superType, Class subType) {
        isAssignable(superType, subType, "");
    }

    /**
     * Assert that <code>superType.isAssignableFrom(subType)</code> is
     * <code>true</code>.
     * 
     * <pre class="code">
     * Assert.isAssignable(Number.class, myClass);
     * </pre>
     * 
     * @param superType the super type to check against
     * @param subType the sub type to check
     * @param message a message which will be prepended to the message produced
     *            by the function itself, and which may be used to provide
     *            context. It should normally end in a ": " or ". " so that the
     *            function generate message looks ok when prepended to it.
     * @throws IllegalArgumentException if the classes are not assignable
     */

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void isAssignable(Class superType, Class subType, String message) {
        notNull(superType, "Type to check against must not be null");
        if (subType == null || !superType.isAssignableFrom(subType)) {
            throw new IllegalArgumentException(message + subType + " is not assignable to "
                    + superType);
        }
    }

    /**
     * Assert a boolean expression, throwing <code>IllegalStateException</code>
     * if the test result is <code>false</code>. Call isTrue if you wish to
     * throw IllegalArgumentException on an assertion failure.
     * 
     * <pre class="code">
     * Assert.state(id == null, &quot;The id property must not already be initialized&quot;);
     * </pre>
     * 
     * @param expression a boolean expression
     * @param message the exception message to use if the assertion fails
     * @throws IllegalStateException if expression is <code>false</code>
     */
    public static void state(boolean expression, String message) {
        if (!expression) {
            throw new IllegalStateException(message);
        }
    }

    /**
     * Assert a boolean expression, throwing {@link IllegalStateException} if
     * the test result is <code>false</code>.
     * <p>
     * Call {@link #isTrue(boolean)} if you wish to throw
     * {@link IllegalArgumentException} on an assertion failure.
     * 
     * <pre class="code">
     * Assert.state(id == null);
     * </pre>
     * 
     * @param expression a boolean expression
     * @throws IllegalStateException if the supplied expression is
     *             <code>false</code>
     */
    public static void state(boolean expression) {
        state(expression, "[Assertion failed] - this state invariant must be true");
    }
    public static void notNumeric(String text) {
    	notNumeric(text,"[Assertion failed] - this String argument must not numeric");
   }
    public static void notNumeric(String text,String message) {
    	 boolean not_ = false;
    	 for(int i=text.length();--i>=0;){
    	      int chr=text.charAt(i);
    	      if(chr<48 || chr>57)
    	    	  not_ = Boolean.TRUE;
    	   }
    	 if(not_){
    		 throw new IllegalStateException(message);
    	 }
    }

}
