.class public final enum Lcom/sonyericsson/android/camera/OneShotType;
.super Ljava/lang/Enum;
.source "OneShotType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/sonyericsson/android/camera/OneShotType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/sonyericsson/android/camera/OneShotType;

.field public static final enum NONE:Lcom/sonyericsson/android/camera/OneShotType;

.field public static final enum PHOTO:Lcom/sonyericsson/android/camera/OneShotType;

.field public static final enum VIDEO:Lcom/sonyericsson/android/camera/OneShotType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 8
    new-instance v0, Lcom/sonyericsson/android/camera/OneShotType;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v2}, Lcom/sonyericsson/android/camera/OneShotType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sonyericsson/android/camera/OneShotType;->NONE:Lcom/sonyericsson/android/camera/OneShotType;

    .line 9
    new-instance v0, Lcom/sonyericsson/android/camera/OneShotType;

    const-string v1, "PHOTO"

    invoke-direct {v0, v1, v3}, Lcom/sonyericsson/android/camera/OneShotType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sonyericsson/android/camera/OneShotType;->PHOTO:Lcom/sonyericsson/android/camera/OneShotType;

    .line 10
    new-instance v0, Lcom/sonyericsson/android/camera/OneShotType;

    const-string v1, "VIDEO"

    invoke-direct {v0, v1, v4}, Lcom/sonyericsson/android/camera/OneShotType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sonyericsson/android/camera/OneShotType;->VIDEO:Lcom/sonyericsson/android/camera/OneShotType;

    .line 7
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/sonyericsson/android/camera/OneShotType;

    sget-object v1, Lcom/sonyericsson/android/camera/OneShotType;->NONE:Lcom/sonyericsson/android/camera/OneShotType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/sonyericsson/android/camera/OneShotType;->PHOTO:Lcom/sonyericsson/android/camera/OneShotType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/sonyericsson/android/camera/OneShotType;->VIDEO:Lcom/sonyericsson/android/camera/OneShotType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/sonyericsson/android/camera/OneShotType;->$VALUES:[Lcom/sonyericsson/android/camera/OneShotType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sonyericsson/android/camera/OneShotType;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 7
    const-class v0, Lcom/sonyericsson/android/camera/OneShotType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/sonyericsson/android/camera/OneShotType;

    return-object v0
.end method

.method public static values()[Lcom/sonyericsson/android/camera/OneShotType;
    .locals 1

    .prologue
    .line 7
    sget-object v0, Lcom/sonyericsson/android/camera/OneShotType;->$VALUES:[Lcom/sonyericsson/android/camera/OneShotType;

    invoke-virtual {v0}, [Lcom/sonyericsson/android/camera/OneShotType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sonyericsson/android/camera/OneShotType;

    return-object v0
.end method
