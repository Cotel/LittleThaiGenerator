package com.cotel.littlethaigenerator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/cotel/littlethaigenerator/RNG;", "", "next", "Larrow/core/Tuple2;", "", "Companion", "littlethaigenerator"})
public abstract interface RNG {
    public static final com.cotel.littlethaigenerator.RNG.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract arrow.core.Tuple2<java.lang.Integer, com.cotel.littlethaigenerator.RNG> next();
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/cotel/littlethaigenerator/RNG$Companion;", "", "()V", "simple", "Lcom/cotel/littlethaigenerator/RNG;", "seed", "", "littlethaigenerator"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.cotel.littlethaigenerator.RNG simple(long seed) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}