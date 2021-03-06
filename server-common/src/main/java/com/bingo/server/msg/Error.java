// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Error.proto

package com.bingo.server.msg;

public final class Error {
  private Error() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code com.bingo.server.msg.ErrorCode}
   */
  public enum ErrorCode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     *通用
     * </pre>
     *
     * <code>OK = 0;</code>
     */
    OK(0),
    /**
     * <pre>
     *字符串为空
     * </pre>
     *
     * <code>NO_STRING = 2;</code>
     */
    NO_STRING(2),
    /**
     * <pre>
     *没有该帐号
     * </pre>
     *
     * <code>NO_ROLE_ACCOUNT = 3;</code>
     */
    NO_ROLE_ACCOUNT(3),
    /**
     * <pre>
     *已经存在用户
     * </pre>
     *
     * <code>EXIST_ROLE = 4;</code>
     */
    EXIST_ROLE(4),
    /**
     * <pre>
     *创建失败
     * </pre>
     *
     * <code>CREATE_FAILED = 5;</code>
     */
    CREATE_FAILED(5),
    /**
     * <pre>
     *拒绝登陆
     * </pre>
     *
     * <code>REJECT_LOGIN = 6;</code>
     */
    REJECT_LOGIN(6),
    /**
     * <pre>
     *帐号不合法，只能是英文字母
     * </pre>
     *
     * <code>ACCOUNT_ILLEGEL = 7;</code>
     */
    ACCOUNT_ILLEGEL(7),
    /**
     * <pre>
     *正在登录中
     * </pre>
     *
     * <code>IN_LOGIN = 8;</code>
     */
    IN_LOGIN(8),
    /**
     * <pre>
     *玩家名有敏感字
     * </pre>
     *
     * <code>NAME_SENSITIVE = 9;</code>
     */
    NAME_SENSITIVE(9),
    /**
     * <pre>
     *没有该玩家信息
     * </pre>
     *
     * <code>NO_ROLE_DATA = 10;</code>
     */
    NO_ROLE_DATA(10),
    /**
     * <pre>
     *名字重复
     * </pre>
     *
     * <code>NAME_REPEATED = 11;</code>
     */
    NAME_REPEATED(11),
    /**
     * <pre>
     *名字过长
     * </pre>
     *
     * <code>NAME_TOO_LONG = 12;</code>
     */
    NAME_TOO_LONG(12),
    /**
     * <pre>
     *名字特殊字符
     * </pre>
     *
     * <code>NAME_SPECIAL_CHAR = 13;</code>
     */
    NAME_SPECIAL_CHAR(13),
    /**
     * <pre>
     *玩家
     * </pre>
     *
     * <code>NO_MONEY = 14;</code>
     */
    NO_MONEY(14),
    /**
     * <pre>
     *服务器链接失败
     * </pre>
     *
     * <code>CONNECT_ERROR = 15;</code>
     */
    CONNECT_ERROR(15),
    /**
     * <pre>
     *匹配
     * </pre>
     *
     * <code>GAME_CREATE_ERROR = 16;</code>
     */
    GAME_CREATE_ERROR(16),
    /**
     * <pre>
     *加入游戏失败
     * </pre>
     *
     * <code>GAME_JOIN_ERROR = 17;</code>
     */
    GAME_JOIN_ERROR(17),
    /**
     * <pre>
     *操作错误
     * </pre>
     *
     * <code>ROUND_ERROR = 18;</code>
     */
    ROUND_ERROR(18),
    /**
     * <pre>
     *兑换数量错误
     * </pre>
     *
     * <code>MONEY_NUM_ERROR = 19;</code>
     */
    MONEY_NUM_ERROR(19),
    /**
     * <pre>
     *房间号错误
     * </pre>
     *
     * <code>MATCH_ERROR_LOCK = 20;</code>
     */
    MATCH_ERROR_LOCK(20),
    /**
     * <pre>
     *房间已经满了
     * </pre>
     *
     * <code>MATCH_MAX_ROLE_COUNT = 21;</code>
     */
    MATCH_MAX_ROLE_COUNT(21),
    /**
     * <pre>
     *游戏不存在
     * </pre>
     *
     * <code>GAME_NOT_EXIST = 22;</code>
     */
    GAME_NOT_EXIST(22),
    /**
     * <pre>
     *其他人正申请退出
     * </pre>
     *
     * <code>GAME_EXITING = 23;</code>
     */
    GAME_EXITING(23),
    /**
     * <pre>
     *拒绝解散房间
     * </pre>
     *
     * <code>APPLY_REJECT = 24;</code>
     */
    APPLY_REJECT(24),
    /**
     * <pre>
     *没轮到你
     * </pre>
     *
     * <code>NOT_YOUR_TURN = 25;</code>
     */
    NOT_YOUR_TURN(25),
    /**
     * <pre>
     *牌型不符
     * </pre>
     *
     * <code>NOT_SAME_TYPE = 26;</code>
     */
    NOT_SAME_TYPE(26),
    /**
     * <pre>
     *牌比上家小
     * </pre>
     *
     * <code>SMALLER = 27;</code>
     */
    SMALLER(27),
    /**
     * <pre>
     *不允许不出牌
     * </pre>
     *
     * <code>NULL_REJECT = 28;</code>
     */
    NULL_REJECT(28),
    /**
     * <pre>
     *你不是地主
     * </pre>
     *
     * <code>NOT_LANDLORD = 29;</code>
     */
    NOT_LANDLORD(29),
    /**
     * <pre>
     *不能明牌
     * </pre>
     *
     * <code>MINGPAI_FORBIDDEN = 30;</code>
     */
    MINGPAI_FORBIDDEN(30),
    /**
     * <pre>
     *第一轮
     * </pre>
     *
     * <code>FIRST_ROUND = 31;</code>
     */
    FIRST_ROUND(31),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     *通用
     * </pre>
     *
     * <code>OK = 0;</code>
     */
    public static final int OK_VALUE = 0;
    /**
     * <pre>
     *字符串为空
     * </pre>
     *
     * <code>NO_STRING = 2;</code>
     */
    public static final int NO_STRING_VALUE = 2;
    /**
     * <pre>
     *没有该帐号
     * </pre>
     *
     * <code>NO_ROLE_ACCOUNT = 3;</code>
     */
    public static final int NO_ROLE_ACCOUNT_VALUE = 3;
    /**
     * <pre>
     *已经存在用户
     * </pre>
     *
     * <code>EXIST_ROLE = 4;</code>
     */
    public static final int EXIST_ROLE_VALUE = 4;
    /**
     * <pre>
     *创建失败
     * </pre>
     *
     * <code>CREATE_FAILED = 5;</code>
     */
    public static final int CREATE_FAILED_VALUE = 5;
    /**
     * <pre>
     *拒绝登陆
     * </pre>
     *
     * <code>REJECT_LOGIN = 6;</code>
     */
    public static final int REJECT_LOGIN_VALUE = 6;
    /**
     * <pre>
     *帐号不合法，只能是英文字母
     * </pre>
     *
     * <code>ACCOUNT_ILLEGEL = 7;</code>
     */
    public static final int ACCOUNT_ILLEGEL_VALUE = 7;
    /**
     * <pre>
     *正在登录中
     * </pre>
     *
     * <code>IN_LOGIN = 8;</code>
     */
    public static final int IN_LOGIN_VALUE = 8;
    /**
     * <pre>
     *玩家名有敏感字
     * </pre>
     *
     * <code>NAME_SENSITIVE = 9;</code>
     */
    public static final int NAME_SENSITIVE_VALUE = 9;
    /**
     * <pre>
     *没有该玩家信息
     * </pre>
     *
     * <code>NO_ROLE_DATA = 10;</code>
     */
    public static final int NO_ROLE_DATA_VALUE = 10;
    /**
     * <pre>
     *名字重复
     * </pre>
     *
     * <code>NAME_REPEATED = 11;</code>
     */
    public static final int NAME_REPEATED_VALUE = 11;
    /**
     * <pre>
     *名字过长
     * </pre>
     *
     * <code>NAME_TOO_LONG = 12;</code>
     */
    public static final int NAME_TOO_LONG_VALUE = 12;
    /**
     * <pre>
     *名字特殊字符
     * </pre>
     *
     * <code>NAME_SPECIAL_CHAR = 13;</code>
     */
    public static final int NAME_SPECIAL_CHAR_VALUE = 13;
    /**
     * <pre>
     *玩家
     * </pre>
     *
     * <code>NO_MONEY = 14;</code>
     */
    public static final int NO_MONEY_VALUE = 14;
    /**
     * <pre>
     *服务器链接失败
     * </pre>
     *
     * <code>CONNECT_ERROR = 15;</code>
     */
    public static final int CONNECT_ERROR_VALUE = 15;
    /**
     * <pre>
     *匹配
     * </pre>
     *
     * <code>GAME_CREATE_ERROR = 16;</code>
     */
    public static final int GAME_CREATE_ERROR_VALUE = 16;
    /**
     * <pre>
     *加入游戏失败
     * </pre>
     *
     * <code>GAME_JOIN_ERROR = 17;</code>
     */
    public static final int GAME_JOIN_ERROR_VALUE = 17;
    /**
     * <pre>
     *操作错误
     * </pre>
     *
     * <code>ROUND_ERROR = 18;</code>
     */
    public static final int ROUND_ERROR_VALUE = 18;
    /**
     * <pre>
     *兑换数量错误
     * </pre>
     *
     * <code>MONEY_NUM_ERROR = 19;</code>
     */
    public static final int MONEY_NUM_ERROR_VALUE = 19;
    /**
     * <pre>
     *房间号错误
     * </pre>
     *
     * <code>MATCH_ERROR_LOCK = 20;</code>
     */
    public static final int MATCH_ERROR_LOCK_VALUE = 20;
    /**
     * <pre>
     *房间已经满了
     * </pre>
     *
     * <code>MATCH_MAX_ROLE_COUNT = 21;</code>
     */
    public static final int MATCH_MAX_ROLE_COUNT_VALUE = 21;
    /**
     * <pre>
     *游戏不存在
     * </pre>
     *
     * <code>GAME_NOT_EXIST = 22;</code>
     */
    public static final int GAME_NOT_EXIST_VALUE = 22;
    /**
     * <pre>
     *其他人正申请退出
     * </pre>
     *
     * <code>GAME_EXITING = 23;</code>
     */
    public static final int GAME_EXITING_VALUE = 23;
    /**
     * <pre>
     *拒绝解散房间
     * </pre>
     *
     * <code>APPLY_REJECT = 24;</code>
     */
    public static final int APPLY_REJECT_VALUE = 24;
    /**
     * <pre>
     *没轮到你
     * </pre>
     *
     * <code>NOT_YOUR_TURN = 25;</code>
     */
    public static final int NOT_YOUR_TURN_VALUE = 25;
    /**
     * <pre>
     *牌型不符
     * </pre>
     *
     * <code>NOT_SAME_TYPE = 26;</code>
     */
    public static final int NOT_SAME_TYPE_VALUE = 26;
    /**
     * <pre>
     *牌比上家小
     * </pre>
     *
     * <code>SMALLER = 27;</code>
     */
    public static final int SMALLER_VALUE = 27;
    /**
     * <pre>
     *不允许不出牌
     * </pre>
     *
     * <code>NULL_REJECT = 28;</code>
     */
    public static final int NULL_REJECT_VALUE = 28;
    /**
     * <pre>
     *你不是地主
     * </pre>
     *
     * <code>NOT_LANDLORD = 29;</code>
     */
    public static final int NOT_LANDLORD_VALUE = 29;
    /**
     * <pre>
     *不能明牌
     * </pre>
     *
     * <code>MINGPAI_FORBIDDEN = 30;</code>
     */
    public static final int MINGPAI_FORBIDDEN_VALUE = 30;
    /**
     * <pre>
     *第一轮
     * </pre>
     *
     * <code>FIRST_ROUND = 31;</code>
     */
    public static final int FIRST_ROUND_VALUE = 31;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ErrorCode valueOf(int value) {
      return forNumber(value);
    }

    public static ErrorCode forNumber(int value) {
      switch (value) {
        case 0: return OK;
        case 2: return NO_STRING;
        case 3: return NO_ROLE_ACCOUNT;
        case 4: return EXIST_ROLE;
        case 5: return CREATE_FAILED;
        case 6: return REJECT_LOGIN;
        case 7: return ACCOUNT_ILLEGEL;
        case 8: return IN_LOGIN;
        case 9: return NAME_SENSITIVE;
        case 10: return NO_ROLE_DATA;
        case 11: return NAME_REPEATED;
        case 12: return NAME_TOO_LONG;
        case 13: return NAME_SPECIAL_CHAR;
        case 14: return NO_MONEY;
        case 15: return CONNECT_ERROR;
        case 16: return GAME_CREATE_ERROR;
        case 17: return GAME_JOIN_ERROR;
        case 18: return ROUND_ERROR;
        case 19: return MONEY_NUM_ERROR;
        case 20: return MATCH_ERROR_LOCK;
        case 21: return MATCH_MAX_ROLE_COUNT;
        case 22: return GAME_NOT_EXIST;
        case 23: return GAME_EXITING;
        case 24: return APPLY_REJECT;
        case 25: return NOT_YOUR_TURN;
        case 26: return NOT_SAME_TYPE;
        case 27: return SMALLER;
        case 28: return NULL_REJECT;
        case 29: return NOT_LANDLORD;
        case 30: return MINGPAI_FORBIDDEN;
        case 31: return FIRST_ROUND;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ErrorCode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ErrorCode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ErrorCode>() {
            public ErrorCode findValueByNumber(int number) {
              return ErrorCode.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.bingo.server.msg.Error.getDescriptor().getEnumTypes().get(0);
    }

    private static final ErrorCode[] VALUES = values();

    public static ErrorCode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ErrorCode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.bingo.server.msg.ErrorCode)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Error.proto\022\024com.bingo.server.msg*\313\004\n\t" +
      "ErrorCode\022\006\n\002OK\020\000\022\r\n\tNO_STRING\020\002\022\023\n\017NO_R" +
      "OLE_ACCOUNT\020\003\022\016\n\nEXIST_ROLE\020\004\022\021\n\rCREATE_" +
      "FAILED\020\005\022\020\n\014REJECT_LOGIN\020\006\022\023\n\017ACCOUNT_IL" +
      "LEGEL\020\007\022\014\n\010IN_LOGIN\020\010\022\022\n\016NAME_SENSITIVE\020" +
      "\t\022\020\n\014NO_ROLE_DATA\020\n\022\021\n\rNAME_REPEATED\020\013\022\021" +
      "\n\rNAME_TOO_LONG\020\014\022\025\n\021NAME_SPECIAL_CHAR\020\r" +
      "\022\014\n\010NO_MONEY\020\016\022\021\n\rCONNECT_ERROR\020\017\022\025\n\021GAM" +
      "E_CREATE_ERROR\020\020\022\023\n\017GAME_JOIN_ERROR\020\021\022\017\n" +
      "\013ROUND_ERROR\020\022\022\023\n\017MONEY_NUM_ERROR\020\023\022\024\n\020M",
      "ATCH_ERROR_LOCK\020\024\022\030\n\024MATCH_MAX_ROLE_COUN" +
      "T\020\025\022\022\n\016GAME_NOT_EXIST\020\026\022\020\n\014GAME_EXITING\020" +
      "\027\022\020\n\014APPLY_REJECT\020\030\022\021\n\rNOT_YOUR_TURN\020\031\022\021" +
      "\n\rNOT_SAME_TYPE\020\032\022\013\n\007SMALLER\020\033\022\017\n\013NULL_R" +
      "EJECT\020\034\022\020\n\014NOT_LANDLORD\020\035\022\025\n\021MINGPAI_FOR" +
      "BIDDEN\020\036\022\017\n\013FIRST_ROUND\020\037b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
