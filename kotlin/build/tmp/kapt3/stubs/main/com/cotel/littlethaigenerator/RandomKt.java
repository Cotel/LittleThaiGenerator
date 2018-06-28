package com.cotel.littlethaigenerator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010\u0013\u001a\u00020\u0004\u001a5\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00150\u0001j\b\u0012\u0004\u0012\u0002H\u0015`\u0005\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0016\u001a\u0002H\u0015\u00a2\u0006\u0002\u0010\u0017\u001a0\u0010\u0018\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\t0\fj\b\u0012\u0004\u0012\u00020\u0004`\r2\u0006\u0010\u0013\u001a\u00020\u0004\u001a;\u0010\u0019\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u00020\u00030\t0\fj\b\u0012\u0004\u0012\u0002H\u0015`\r\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0016\u001a\u0002H\u0015\u00a2\u0006\u0002\u0010\u001a\u001an\u0010\u001b\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u00020\u00030\t0\fj\b\u0012\u0004\u0012\u0002H\u001c`\r\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\u001c*$\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u00020\u00030\t0\fj\b\u0012\u0004\u0012\u0002H\u0015`\r2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u001c0\f\"-\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"E\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t0\u0001j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007\"3\u0010\u000b\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\t0\fj\b\u0012\u0004\u0012\u00020\u0004`\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"K\u0010\u0010\u001a<\u0012\u0004\u0012\u00020\u0003\u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t\u0012\u0004\u0012\u00020\u00030\t0\fj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t`\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f*.\u0010\u001e\u001a\u0004\b\u0000\u0010\u0015\"\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u0015`\u001f2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00150\u0001*@\u0010 \u001a\u0004\b\u0000\u0010\u0015\"\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u00020\u00030\t0\f2\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u00020\u00030\t0\f\u00a8\u0006!"}, d2 = {"arrowInt", "Larrow/data/StateT;", "Larrow/core/ForId;", "Lcom/cotel/littlethaigenerator/RNG;", "", "Lcom/cotel/littlethaigenerator/ArrowRand;", "getArrowInt", "()Larrow/data/StateT;", "arrowRandomPair", "Larrow/core/Tuple2;", "getArrowRandomPair", "int", "Lkotlin/Function1;", "Lcom/cotel/littlethaigenerator/Rand;", "getInt", "()Lkotlin/jvm/functions/Function1;", "randomPair", "getRandomPair", "arrowPositiveMax", "n", "arrowUnit", "A", "a", "(Ljava/lang/Object;)Larrow/data/StateT;", "positiveMax", "unit", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "map", "B", "f", "ArrowRand", "Larrow/data/State;", "Rand", "littlethaigenerator"})
public final class RandomKt {
    @org.jetbrains.annotations.NotNull()
    private static final arrow.data.StateT<arrow.core.ForId, com.cotel.littlethaigenerator.RNG, java.lang.Integer> arrowInt = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.jvm.functions.Function1<com.cotel.littlethaigenerator.RNG, arrow.core.Tuple2<arrow.core.Tuple2<java.lang.Integer, java.lang.Integer>, com.cotel.littlethaigenerator.RNG>> randomPair = null;
    @org.jetbrains.annotations.NotNull()
    private static final arrow.data.StateT<arrow.core.ForId, com.cotel.littlethaigenerator.RNG, arrow.core.Tuple2<java.lang.Integer, java.lang.Integer>> arrowRandomPair = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final <A extends java.lang.Object>kotlin.jvm.functions.Function1<com.cotel.littlethaigenerator.RNG, arrow.core.Tuple2<A, com.cotel.littlethaigenerator.RNG>> unit(A a) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <A extends java.lang.Object>arrow.data.StateT<arrow.core.ForId, com.cotel.littlethaigenerator.RNG, A> arrowUnit(A a) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <A extends java.lang.Object, B extends java.lang.Object>kotlin.jvm.functions.Function1<com.cotel.littlethaigenerator.RNG, arrow.core.Tuple2<B, com.cotel.littlethaigenerator.RNG>> map(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.cotel.littlethaigenerator.RNG, ? extends arrow.core.Tuple2<? extends A, ? extends com.cotel.littlethaigenerator.RNG>> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super A, ? extends B> f) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlin.jvm.functions.Function1<com.cotel.littlethaigenerator.RNG, arrow.core.Tuple2<java.lang.Integer, com.cotel.littlethaigenerator.RNG>> getInt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final arrow.data.StateT<arrow.core.ForId, com.cotel.littlethaigenerator.RNG, java.lang.Integer> getArrowInt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlin.jvm.functions.Function1<com.cotel.littlethaigenerator.RNG, arrow.core.Tuple2<arrow.core.Tuple2<java.lang.Integer, java.lang.Integer>, com.cotel.littlethaigenerator.RNG>> getRandomPair() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final arrow.data.StateT<arrow.core.ForId, com.cotel.littlethaigenerator.RNG, arrow.core.Tuple2<java.lang.Integer, java.lang.Integer>> getArrowRandomPair() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlin.jvm.functions.Function1<com.cotel.littlethaigenerator.RNG, arrow.core.Tuple2<java.lang.Integer, com.cotel.littlethaigenerator.RNG>> positiveMax(int n) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final arrow.data.StateT<arrow.core.ForId, com.cotel.littlethaigenerator.RNG, java.lang.Integer> arrowPositiveMax(int n) {
        return null;
    }
}