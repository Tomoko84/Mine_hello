.class Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver$VideoEventObserverImpl;
.super Ljava/lang/Object;
.source "WearableBridgeServerBroadcastReceiver.java"

# interfaces
.implements Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/client/ObserveWearableInterface$VideoEventObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "VideoEventObserverImpl"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver;


# direct methods
.method private constructor <init>(Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver;)V
    .locals 0

    .prologue
    .line 190
    iput-object p1, p0, Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver$VideoEventObserverImpl;->this$0:Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver;Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver;
    .param p2, "x1"    # Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver$1;

    .prologue
    .line 190
    invoke-direct {p0, p1}, Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver$VideoEventObserverImpl;-><init>(Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver;)V

    return-void
.end method


# virtual methods
.method public onStartVideoRecRequested()V
    .locals 3

    .prologue
    .line 193
    iget-object v1, p0, Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver$VideoEventObserverImpl;->this$0:Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver;

    const-string v2, "com.sonymobile.cameracommon.wearablebridge.SERVER_VIDEO_START_REC_REQUESTED"

    # invokes: Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver;->getNotifierIntent(Ljava/lang/String;)Landroid/content/Intent;
    invoke-static {v1, v2}, Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver;->access$300(Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 194
    .local v0, "intent":Landroid/content/Intent;
    # getter for: Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver;->mContext:Landroid/content/Context;
    invoke-static {}, Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver;->access$400()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 195
    return-void
.end method

.method public onStopVideoRecRequested()V
    .locals 3

    .prologue
    .line 199
    iget-object v1, p0, Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver$VideoEventObserverImpl;->this$0:Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver;

    const-string v2, "com.sonymobile.cameracommon.wearablebridge.SERVER_VIDEO_STOP_REC_REQUESTED"

    # invokes: Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver;->getNotifierIntent(Ljava/lang/String;)Landroid/content/Intent;
    invoke-static {v1, v2}, Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver;->access$300(Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 200
    .local v0, "intent":Landroid/content/Intent;
    # getter for: Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver;->mContext:Landroid/content/Context;
    invoke-static {}, Lcom/sonymobile/cameracommon/vanilla/wearablebridge/handheld/server/WearableBridgeServerBroadcastReceiver;->access$400()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 201
    return-void
.end method
