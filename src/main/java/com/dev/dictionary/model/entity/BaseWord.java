package com.dev.dictionary.model.entity;

import com.dev.dictionary.model.enums.WordType;

import java.time.LocalDateTime;

public abstract class BaseWord {
    private Long id;
    private String german;
    private String persian;
    private String exampleSentenceGermany;
    private String exampleSentencePersian;
    private WordType wordType;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
