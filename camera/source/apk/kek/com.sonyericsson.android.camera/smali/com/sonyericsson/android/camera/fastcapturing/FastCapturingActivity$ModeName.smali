.class public final enum Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;
.super Ljava/lang/Enum;
.source "FastCapturingActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ModeName"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;

.field public static final enum FAST_CAPTURING_CAMERA:Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;

.field public static final enum FAST_CAPTURING_VIDEO:Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 104
    new-instance v0, Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;

    const-string v1, "FAST_CAPTURING_CAMERA"

    invoke-direct {v0, v1, v2}, Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;->FAST_CAPTURING_CAMERA:Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;

    .line 105
    new-instance v0, Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;

    const-string v1, "FAST_CAPTURING_VIDEO"

    invoke-direct {v0, v1, v3}, Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;->FAST_CAPTURING_VIDEO:Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;

    .line 103
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;

    sget-object v1, Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;->FAST_CAPTURING_CAMERA:Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;

    aput-object v1, v0, v2

    sget-object v1, Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;->FAST_CAPTURING_VIDEO:Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;

    aput-object v1, v0, v3

    sput-object v0, Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;->$VALUES:[Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;

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
    .line 103
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 103
    const-class v0, Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;

    return-object v0
.end method

.method public static values()[Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;
    .locals 1

    .prologue
    .line 103
    sget-object v0, Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;->$VALUES:[Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;

    invoke-virtual {v0}, [Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sonyericsson/android/camera/fastcapturing/FastCapturingActivity$ModeName;

    return-object v0
.end method
