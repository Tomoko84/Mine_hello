.class Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase$OnConnectionFailedCallback;
.super Ljava/lang/Object;
.source "WearableBridgeBase.java"

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "OnConnectionFailedCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;


# direct methods
.method private constructor <init>(Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;)V
    .locals 0

    .prologue
    .line 264
    iput-object p1, p0, Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase$OnConnectionFailedCallback;->this$0:Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;
    .param p2, "x1"    # Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase$1;

    .prologue
    .line 264
    invoke-direct {p0, p1}, Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase$OnConnectionFailedCallback;-><init>(Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;)V

    return-void
.end method


# virtual methods
.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2
    .param p1, "result"    # Lcom/google/android/gms/common/ConnectionResult;

    .prologue
    .line 272
    iget-object v0, p0, Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase$OnConnectionFailedCallback;->this$0:Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;

    # invokes: Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;->releaseApiCallbacks()V
    invoke-static {v0}, Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;->access$2000(Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;)V

    .line 274
    iget-object v0, p0, Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase$OnConnectionFailedCallback;->this$0:Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;

    # getter for: Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;->mIsNowOnResolutionForGooglePlayApiServiceConnection:Z
    invoke-static {v0}, Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;->access$1700(Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 293
    :goto_0
    return-void

    .line 279
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->hasResolution()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 283
    iget-object v0, p0, Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase$OnConnectionFailedCallback;->this$0:Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;

    const/4 v1, 0x1

    # setter for: Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;->mIsNowOnResolutionForGooglePlayApiServiceConnection:Z
    invoke-static {v0, v1}, Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;->access$1702(Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;Z)Z

    .line 287
    iget-object v0, p0, Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase$OnConnectionFailedCallback;->this$0:Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;

    # getter for: Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    invoke-static {v0}, Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;->access$700(Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    goto :goto_0

    .line 291
    :cond_1
    iget-object v0, p0, Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase$OnConnectionFailedCallback;->this$0:Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;

    const/4 v1, 0x0

    # setter for: Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;->mIsNowOnResolutionForGooglePlayApiServiceConnection:Z
    invoke-static {v0, v1}, Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;->access$1702(Lcom/sonymobile/cameracommon/vanilla/wearablebridge/common/WearableBridgeBase;Z)Z

    goto :goto_0
.end method
