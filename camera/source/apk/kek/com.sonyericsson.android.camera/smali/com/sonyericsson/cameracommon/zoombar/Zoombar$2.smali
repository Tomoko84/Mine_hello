.class synthetic Lcom/sonyericsson/cameracommon/zoombar/Zoombar$2;
.super Ljava/lang/Object;
.source "Zoombar.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sonyericsson/cameracommon/zoombar/Zoombar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$sonyericsson$cameracommon$zoombar$Zoombar$Type:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 107
    invoke-static {}, Lcom/sonyericsson/cameracommon/zoombar/Zoombar$Type;->values()[Lcom/sonyericsson/cameracommon/zoombar/Zoombar$Type;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/sonyericsson/cameracommon/zoombar/Zoombar$2;->$SwitchMap$com$sonyericsson$cameracommon$zoombar$Zoombar$Type:[I

    :try_start_0
    sget-object v0, Lcom/sonyericsson/cameracommon/zoombar/Zoombar$2;->$SwitchMap$com$sonyericsson$cameracommon$zoombar$Zoombar$Type:[I

    sget-object v1, Lcom/sonyericsson/cameracommon/zoombar/Zoombar$Type;->NORMAL:Lcom/sonyericsson/cameracommon/zoombar/Zoombar$Type;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    :try_start_1
    sget-object v0, Lcom/sonyericsson/cameracommon/zoombar/Zoombar$2;->$SwitchMap$com$sonyericsson$cameracommon$zoombar$Zoombar$Type:[I

    sget-object v1, Lcom/sonyericsson/cameracommon/zoombar/Zoombar$Type;->PARTIAL_SUPER_RESOLUTION:Lcom/sonyericsson/cameracommon/zoombar/Zoombar$Type;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    return-void

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0
.end method
