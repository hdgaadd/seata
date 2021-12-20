package com.codeman.domain;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author hdgaadd
 * @since 2021-12-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long userId;

    private BigDecimal balance;

    private String comment;


}
