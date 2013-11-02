/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.berkeley.thebes.twopl.common.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TwoPLSlaveReplicaService {

  public interface Iface {

    public void put(String key, edu.berkeley.thebes.common.thrift.ThriftDataItem value) throws org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void put(String key, edu.berkeley.thebes.common.thrift.ThriftDataItem value, org.apache.thrift.async.AsyncMethodCallback<AsyncClient.put_call> resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public void put(String key, edu.berkeley.thebes.common.thrift.ThriftDataItem value) throws org.apache.thrift.TException
    {
      send_put(key, value);
    }

    public void send_put(String key, edu.berkeley.thebes.common.thrift.ThriftDataItem value) throws org.apache.thrift.TException
    {
      put_args args = new put_args();
      args.setKey(key);
      args.setValue(value);
      sendBase("put", args);
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void put(String key, edu.berkeley.thebes.common.thrift.ThriftDataItem value, org.apache.thrift.async.AsyncMethodCallback<put_call> resultHandler) throws org.apache.thrift.TException {
      checkReady();
      put_call method_call = new put_call(key, value, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class put_call extends org.apache.thrift.async.TAsyncMethodCall {
      private String key;
      private edu.berkeley.thebes.common.thrift.ThriftDataItem value;
      public put_call(String key, edu.berkeley.thebes.common.thrift.ThriftDataItem value, org.apache.thrift.async.AsyncMethodCallback<put_call> resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, true);
        this.key = key;
        this.value = value;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("put", org.apache.thrift.protocol.TMessageType.CALL, 0));
        put_args args = new put_args();
        args.setKey(key);
        args.setValue(value);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public void getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("put", new put());
      return processMap;
    }

    public static class put<I extends Iface> extends org.apache.thrift.ProcessFunction<I, put_args> {
      public put() {
        super("put");
      }

      public put_args getEmptyArgsInstance() {
        return new put_args();
      }

      protected boolean isOneway() {
        return true;
      }

      public org.apache.thrift.TBase getResult(I iface, put_args args) throws org.apache.thrift.TException {
        iface.put(args.key, args.value);
        return null;
      }
    }

  }

  public static class put_args implements org.apache.thrift.TBase<put_args, put_args._Fields>, java.io.Serializable, Cloneable   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("put_args");

    private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key", org.apache.thrift.protocol.TType.STRING, (short)1);
    private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.STRUCT, (short)2);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new put_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new put_argsTupleSchemeFactory());
    }

    public String key; // required
    public edu.berkeley.thebes.common.thrift.ThriftDataItem value; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      KEY((short)1, "key"),
      VALUE((short)2, "value");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 1: // KEY
            return KEY;
          case 2: // VALUE
            return VALUE;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.KEY, new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
      tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.berkeley.thebes.common.thrift.ThriftDataItem.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(put_args.class, metaDataMap);
    }

    public put_args() {
    }

    public put_args(
      String key,
      edu.berkeley.thebes.common.thrift.ThriftDataItem value)
    {
      this();
      this.key = key;
      this.value = value;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public put_args(put_args other) {
      if (other.isSetKey()) {
        this.key = other.key;
      }
      if (other.isSetValue()) {
        this.value = new edu.berkeley.thebes.common.thrift.ThriftDataItem(other.value);
      }
    }

    public put_args deepCopy() {
      return new put_args(this);
    }

    @Override
    public void clear() {
      this.key = null;
      this.value = null;
    }

    public String getKey() {
      return this.key;
    }

    public put_args setKey(String key) {
      this.key = key;
      return this;
    }

    public void unsetKey() {
      this.key = null;
    }

    /** Returns true if field key is set (has been assigned a value) and false otherwise */
    public boolean isSetKey() {
      return this.key != null;
    }

    public void setKeyIsSet(boolean value) {
      if (!value) {
        this.key = null;
      }
    }

    public edu.berkeley.thebes.common.thrift.ThriftDataItem getValue() {
      return this.value;
    }

    public put_args setValue(edu.berkeley.thebes.common.thrift.ThriftDataItem value) {
      this.value = value;
      return this;
    }

    public void unsetValue() {
      this.value = null;
    }

    /** Returns true if field value is set (has been assigned a value) and false otherwise */
    public boolean isSetValue() {
      return this.value != null;
    }

    public void setValueIsSet(boolean value) {
      if (!value) {
        this.value = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case KEY:
        if (value == null) {
          unsetKey();
        } else {
          setKey((String)value);
        }
        break;

      case VALUE:
        if (value == null) {
          unsetValue();
        } else {
          setValue((edu.berkeley.thebes.common.thrift.ThriftDataItem)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case KEY:
        return getKey();

      case VALUE:
        return getValue();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case KEY:
        return isSetKey();
      case VALUE:
        return isSetValue();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof put_args)
        return this.equals((put_args)that);
      return false;
    }

    public boolean equals(put_args that) {
      if (that == null)
        return false;

      boolean this_present_key = true && this.isSetKey();
      boolean that_present_key = true && that.isSetKey();
      if (this_present_key || that_present_key) {
        if (!(this_present_key && that_present_key))
          return false;
        if (!this.key.equals(that.key))
          return false;
      }

      boolean this_present_value = true && this.isSetValue();
      boolean that_present_value = true && that.isSetValue();
      if (this_present_value || that_present_value) {
        if (!(this_present_value && that_present_value))
          return false;
        if (!this.value.equals(that.value))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    public int compareTo(put_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;
      put_args typedOther = (put_args)other;

      lastComparison = Boolean.valueOf(isSetKey()).compareTo(typedOther.isSetKey());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetKey()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key, typedOther.key);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = Boolean.valueOf(isSetValue()).compareTo(typedOther.isSetValue());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetValue()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, typedOther.value);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("put_args(");
      boolean first = true;

      sb.append("key:");
      if (this.key == null) {
        sb.append("null");
      } else {
        sb.append(this.key);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("value:");
      if (this.value == null) {
        sb.append("null");
      } else {
        sb.append(this.value);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (value != null) {
        value.validate();
      }
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class put_argsStandardSchemeFactory implements SchemeFactory {
      public put_argsStandardScheme getScheme() {
        return new put_argsStandardScheme();
      }
    }

    private static class put_argsStandardScheme extends StandardScheme<put_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, put_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // KEY
              if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                struct.key = iprot.readString();
                struct.setKeyIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 2: // VALUE
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.value = new edu.berkeley.thebes.common.thrift.ThriftDataItem();
                struct.value.read(iprot);
                struct.setValueIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, put_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.key != null) {
          oprot.writeFieldBegin(KEY_FIELD_DESC);
          oprot.writeString(struct.key);
          oprot.writeFieldEnd();
        }
        if (struct.value != null) {
          oprot.writeFieldBegin(VALUE_FIELD_DESC);
          struct.value.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class put_argsTupleSchemeFactory implements SchemeFactory {
      public put_argsTupleScheme getScheme() {
        return new put_argsTupleScheme();
      }
    }

    private static class put_argsTupleScheme extends TupleScheme<put_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, put_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetKey()) {
          optionals.set(0);
        }
        if (struct.isSetValue()) {
          optionals.set(1);
        }
        oprot.writeBitSet(optionals, 2);
        if (struct.isSetKey()) {
          oprot.writeString(struct.key);
        }
        if (struct.isSetValue()) {
          struct.value.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, put_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(2);
        if (incoming.get(0)) {
          struct.key = iprot.readString();
          struct.setKeyIsSet(true);
        }
        if (incoming.get(1)) {
          struct.value = new edu.berkeley.thebes.common.thrift.ThriftDataItem();
          struct.value.read(iprot);
          struct.setValueIsSet(true);
        }
      }
    }

  }

}