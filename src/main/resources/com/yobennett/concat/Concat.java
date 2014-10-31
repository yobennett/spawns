// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: concat.proto

package com.yobennett.concat;

public final class Concat {
  private Concat() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ConcatRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:concat.ConcatRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string a = 1;</code>
     */
    boolean hasA();
    /**
     * <code>required string a = 1;</code>
     */
    java.lang.String getA();
    /**
     * <code>required string a = 1;</code>
     */
    com.google.protobuf.ByteString
        getABytes();

    /**
     * <code>required string b = 2;</code>
     */
    boolean hasB();
    /**
     * <code>required string b = 2;</code>
     */
    java.lang.String getB();
    /**
     * <code>required string b = 2;</code>
     */
    com.google.protobuf.ByteString
        getBBytes();
  }
  /**
   * Protobuf type {@code concat.ConcatRequest}
   */
  public static final class ConcatRequest extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:concat.ConcatRequest)
      ConcatRequestOrBuilder {
    // Use ConcatRequest.newBuilder() to construct.
    private ConcatRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ConcatRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ConcatRequest defaultInstance;
    public static ConcatRequest getDefaultInstance() {
      return defaultInstance;
    }

    public ConcatRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ConcatRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              a_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              b_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.yobennett.concat.Concat.internal_static_concat_ConcatRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.yobennett.concat.Concat.internal_static_concat_ConcatRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.yobennett.concat.Concat.ConcatRequest.class, com.yobennett.concat.Concat.ConcatRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<ConcatRequest> PARSER =
        new com.google.protobuf.AbstractParser<ConcatRequest>() {
      public ConcatRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ConcatRequest(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ConcatRequest> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int A_FIELD_NUMBER = 1;
    private java.lang.Object a_;
    /**
     * <code>required string a = 1;</code>
     */
    public boolean hasA() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string a = 1;</code>
     */
    public java.lang.String getA() {
      java.lang.Object ref = a_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          a_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string a = 1;</code>
     */
    public com.google.protobuf.ByteString
        getABytes() {
      java.lang.Object ref = a_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        a_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int B_FIELD_NUMBER = 2;
    private java.lang.Object b_;
    /**
     * <code>required string b = 2;</code>
     */
    public boolean hasB() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string b = 2;</code>
     */
    public java.lang.String getB() {
      java.lang.Object ref = b_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          b_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string b = 2;</code>
     */
    public com.google.protobuf.ByteString
        getBBytes() {
      java.lang.Object ref = b_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        b_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      a_ = "";
      b_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasA()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasB()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getABytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getBBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getABytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getBBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.yobennett.concat.Concat.ConcatRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.yobennett.concat.Concat.ConcatRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.yobennett.concat.Concat.ConcatRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.yobennett.concat.Concat.ConcatRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.yobennett.concat.Concat.ConcatRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.yobennett.concat.Concat.ConcatRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.yobennett.concat.Concat.ConcatRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.yobennett.concat.Concat.ConcatRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.yobennett.concat.Concat.ConcatRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.yobennett.concat.Concat.ConcatRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.yobennett.concat.Concat.ConcatRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code concat.ConcatRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:concat.ConcatRequest)
        com.yobennett.concat.Concat.ConcatRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.yobennett.concat.Concat.internal_static_concat_ConcatRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.yobennett.concat.Concat.internal_static_concat_ConcatRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.yobennett.concat.Concat.ConcatRequest.class, com.yobennett.concat.Concat.ConcatRequest.Builder.class);
      }

      // Construct using com.yobennett.concat.Concat.ConcatRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        a_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        b_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.yobennett.concat.Concat.internal_static_concat_ConcatRequest_descriptor;
      }

      public com.yobennett.concat.Concat.ConcatRequest getDefaultInstanceForType() {
        return com.yobennett.concat.Concat.ConcatRequest.getDefaultInstance();
      }

      public com.yobennett.concat.Concat.ConcatRequest build() {
        com.yobennett.concat.Concat.ConcatRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.yobennett.concat.Concat.ConcatRequest buildPartial() {
        com.yobennett.concat.Concat.ConcatRequest result = new com.yobennett.concat.Concat.ConcatRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.a_ = a_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.b_ = b_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.yobennett.concat.Concat.ConcatRequest) {
          return mergeFrom((com.yobennett.concat.Concat.ConcatRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.yobennett.concat.Concat.ConcatRequest other) {
        if (other == com.yobennett.concat.Concat.ConcatRequest.getDefaultInstance()) return this;
        if (other.hasA()) {
          bitField0_ |= 0x00000001;
          a_ = other.a_;
          onChanged();
        }
        if (other.hasB()) {
          bitField0_ |= 0x00000002;
          b_ = other.b_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasA()) {
          
          return false;
        }
        if (!hasB()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.yobennett.concat.Concat.ConcatRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.yobennett.concat.Concat.ConcatRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object a_ = "";
      /**
       * <code>required string a = 1;</code>
       */
      public boolean hasA() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string a = 1;</code>
       */
      public java.lang.String getA() {
        java.lang.Object ref = a_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            a_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string a = 1;</code>
       */
      public com.google.protobuf.ByteString
          getABytes() {
        java.lang.Object ref = a_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          a_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string a = 1;</code>
       */
      public Builder setA(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        a_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string a = 1;</code>
       */
      public Builder clearA() {
        bitField0_ = (bitField0_ & ~0x00000001);
        a_ = getDefaultInstance().getA();
        onChanged();
        return this;
      }
      /**
       * <code>required string a = 1;</code>
       */
      public Builder setABytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        a_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object b_ = "";
      /**
       * <code>required string b = 2;</code>
       */
      public boolean hasB() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string b = 2;</code>
       */
      public java.lang.String getB() {
        java.lang.Object ref = b_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            b_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string b = 2;</code>
       */
      public com.google.protobuf.ByteString
          getBBytes() {
        java.lang.Object ref = b_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          b_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string b = 2;</code>
       */
      public Builder setB(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        b_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string b = 2;</code>
       */
      public Builder clearB() {
        bitField0_ = (bitField0_ & ~0x00000002);
        b_ = getDefaultInstance().getB();
        onChanged();
        return this;
      }
      /**
       * <code>required string b = 2;</code>
       */
      public Builder setBBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        b_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:concat.ConcatRequest)
    }

    static {
      defaultInstance = new ConcatRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:concat.ConcatRequest)
  }

  public interface ConcatResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:concat.ConcatResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string c = 1;</code>
     */
    boolean hasC();
    /**
     * <code>required string c = 1;</code>
     */
    java.lang.String getC();
    /**
     * <code>required string c = 1;</code>
     */
    com.google.protobuf.ByteString
        getCBytes();
  }
  /**
   * Protobuf type {@code concat.ConcatResponse}
   */
  public static final class ConcatResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:concat.ConcatResponse)
      ConcatResponseOrBuilder {
    // Use ConcatResponse.newBuilder() to construct.
    private ConcatResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ConcatResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ConcatResponse defaultInstance;
    public static ConcatResponse getDefaultInstance() {
      return defaultInstance;
    }

    public ConcatResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ConcatResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              c_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.yobennett.concat.Concat.internal_static_concat_ConcatResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.yobennett.concat.Concat.internal_static_concat_ConcatResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.yobennett.concat.Concat.ConcatResponse.class, com.yobennett.concat.Concat.ConcatResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<ConcatResponse> PARSER =
        new com.google.protobuf.AbstractParser<ConcatResponse>() {
      public ConcatResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ConcatResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ConcatResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int C_FIELD_NUMBER = 1;
    private java.lang.Object c_;
    /**
     * <code>required string c = 1;</code>
     */
    public boolean hasC() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string c = 1;</code>
     */
    public java.lang.String getC() {
      java.lang.Object ref = c_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          c_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string c = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCBytes() {
      java.lang.Object ref = c_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        c_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      c_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasC()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getCBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getCBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.yobennett.concat.Concat.ConcatResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.yobennett.concat.Concat.ConcatResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.yobennett.concat.Concat.ConcatResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.yobennett.concat.Concat.ConcatResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.yobennett.concat.Concat.ConcatResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.yobennett.concat.Concat.ConcatResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.yobennett.concat.Concat.ConcatResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.yobennett.concat.Concat.ConcatResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.yobennett.concat.Concat.ConcatResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.yobennett.concat.Concat.ConcatResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.yobennett.concat.Concat.ConcatResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code concat.ConcatResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:concat.ConcatResponse)
        com.yobennett.concat.Concat.ConcatResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.yobennett.concat.Concat.internal_static_concat_ConcatResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.yobennett.concat.Concat.internal_static_concat_ConcatResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.yobennett.concat.Concat.ConcatResponse.class, com.yobennett.concat.Concat.ConcatResponse.Builder.class);
      }

      // Construct using com.yobennett.concat.Concat.ConcatResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        c_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.yobennett.concat.Concat.internal_static_concat_ConcatResponse_descriptor;
      }

      public com.yobennett.concat.Concat.ConcatResponse getDefaultInstanceForType() {
        return com.yobennett.concat.Concat.ConcatResponse.getDefaultInstance();
      }

      public com.yobennett.concat.Concat.ConcatResponse build() {
        com.yobennett.concat.Concat.ConcatResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.yobennett.concat.Concat.ConcatResponse buildPartial() {
        com.yobennett.concat.Concat.ConcatResponse result = new com.yobennett.concat.Concat.ConcatResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.c_ = c_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.yobennett.concat.Concat.ConcatResponse) {
          return mergeFrom((com.yobennett.concat.Concat.ConcatResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.yobennett.concat.Concat.ConcatResponse other) {
        if (other == com.yobennett.concat.Concat.ConcatResponse.getDefaultInstance()) return this;
        if (other.hasC()) {
          bitField0_ |= 0x00000001;
          c_ = other.c_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasC()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.yobennett.concat.Concat.ConcatResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.yobennett.concat.Concat.ConcatResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object c_ = "";
      /**
       * <code>required string c = 1;</code>
       */
      public boolean hasC() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string c = 1;</code>
       */
      public java.lang.String getC() {
        java.lang.Object ref = c_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            c_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string c = 1;</code>
       */
      public com.google.protobuf.ByteString
          getCBytes() {
        java.lang.Object ref = c_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          c_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string c = 1;</code>
       */
      public Builder setC(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        c_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string c = 1;</code>
       */
      public Builder clearC() {
        bitField0_ = (bitField0_ & ~0x00000001);
        c_ = getDefaultInstance().getC();
        onChanged();
        return this;
      }
      /**
       * <code>required string c = 1;</code>
       */
      public Builder setCBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        c_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:concat.ConcatResponse)
    }

    static {
      defaultInstance = new ConcatResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:concat.ConcatResponse)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_concat_ConcatRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_concat_ConcatRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_concat_ConcatResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_concat_ConcatResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014concat.proto\022\006concat\"%\n\rConcatRequest\022" +
      "\t\n\001a\030\001 \002(\t\022\t\n\001b\030\002 \002(\t\"\033\n\016ConcatResponse\022" +
      "\t\n\001c\030\001 \002(\t2H\n\rConcatService\0227\n\006Concat\022\025." +
      "concat.ConcatRequest\032\026.concat.ConcatResp" +
      "onseB\036\n\024com.yobennett.concatB\006Concat"
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
    internal_static_concat_ConcatRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_concat_ConcatRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_concat_ConcatRequest_descriptor,
        new java.lang.String[] { "A", "B", });
    internal_static_concat_ConcatResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_concat_ConcatResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_concat_ConcatResponse_descriptor,
        new java.lang.String[] { "C", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
