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

public class TwoPLTransactionResult implements org.apache.thrift.TBase<TwoPLTransactionResult, TwoPLTransactionResult._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TwoPLTransactionResult");

  private static final org.apache.thrift.protocol.TField REQUESTED_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("requestedValues", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TwoPLTransactionResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TwoPLTransactionResultTupleSchemeFactory());
  }

  public Map<String,ByteBuffer> requestedValues; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REQUESTED_VALUES((short)2, "requestedValues");

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
        case 2: // REQUESTED_VALUES
          return REQUESTED_VALUES;
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
    tmpMap.put(_Fields.REQUESTED_VALUES, new org.apache.thrift.meta_data.FieldMetaData("requestedValues", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , true))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TwoPLTransactionResult.class, metaDataMap);
  }

  public TwoPLTransactionResult() {
  }

  public TwoPLTransactionResult(
    Map<String,ByteBuffer> requestedValues)
  {
    this();
    this.requestedValues = requestedValues;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TwoPLTransactionResult(TwoPLTransactionResult other) {
    if (other.isSetRequestedValues()) {
      Map<String,ByteBuffer> __this__requestedValues = new HashMap<String,ByteBuffer>();
      for (Map.Entry<String, ByteBuffer> other_element : other.requestedValues.entrySet()) {

        String other_element_key = other_element.getKey();
        ByteBuffer other_element_value = other_element.getValue();

        String __this__requestedValues_copy_key = other_element_key;

        ByteBuffer __this__requestedValues_copy_value = org.apache.thrift.TBaseHelper.copyBinary(other_element_value);
;

        __this__requestedValues.put(__this__requestedValues_copy_key, __this__requestedValues_copy_value);
      }
      this.requestedValues = __this__requestedValues;
    }
  }

  public TwoPLTransactionResult deepCopy() {
    return new TwoPLTransactionResult(this);
  }

  @Override
  public void clear() {
    this.requestedValues = null;
  }

  public int getRequestedValuesSize() {
    return (this.requestedValues == null) ? 0 : this.requestedValues.size();
  }

  public void putToRequestedValues(String key, ByteBuffer val) {
    if (this.requestedValues == null) {
      this.requestedValues = new HashMap<String,ByteBuffer>();
    }
    this.requestedValues.put(key, val);
  }

  public Map<String,ByteBuffer> getRequestedValues() {
    return this.requestedValues;
  }

  public TwoPLTransactionResult setRequestedValues(Map<String,ByteBuffer> requestedValues) {
    this.requestedValues = requestedValues;
    return this;
  }

  public void unsetRequestedValues() {
    this.requestedValues = null;
  }

  /** Returns true if field requestedValues is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestedValues() {
    return this.requestedValues != null;
  }

  public void setRequestedValuesIsSet(boolean value) {
    if (!value) {
      this.requestedValues = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REQUESTED_VALUES:
      if (value == null) {
        unsetRequestedValues();
      } else {
        setRequestedValues((Map<String,ByteBuffer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REQUESTED_VALUES:
      return getRequestedValues();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REQUESTED_VALUES:
      return isSetRequestedValues();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TwoPLTransactionResult)
      return this.equals((TwoPLTransactionResult)that);
    return false;
  }

  public boolean equals(TwoPLTransactionResult that) {
    if (that == null)
      return false;

    boolean this_present_requestedValues = true && this.isSetRequestedValues();
    boolean that_present_requestedValues = true && that.isSetRequestedValues();
    if (this_present_requestedValues || that_present_requestedValues) {
      if (!(this_present_requestedValues && that_present_requestedValues))
        return false;
      if (!this.requestedValues.equals(that.requestedValues))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TwoPLTransactionResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TwoPLTransactionResult typedOther = (TwoPLTransactionResult)other;

    lastComparison = Boolean.valueOf(isSetRequestedValues()).compareTo(typedOther.isSetRequestedValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestedValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestedValues, typedOther.requestedValues);
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
    StringBuilder sb = new StringBuilder("TwoPLTransactionResult(");
    boolean first = true;

    sb.append("requestedValues:");
    if (this.requestedValues == null) {
      sb.append("null");
    } else {
      sb.append(this.requestedValues);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class TwoPLTransactionResultStandardSchemeFactory implements SchemeFactory {
    public TwoPLTransactionResultStandardScheme getScheme() {
      return new TwoPLTransactionResultStandardScheme();
    }
  }

  private static class TwoPLTransactionResultStandardScheme extends StandardScheme<TwoPLTransactionResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TwoPLTransactionResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 2: // REQUESTED_VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.requestedValues = new HashMap<String,ByteBuffer>(2*_map0.size);
                for (int _i1 = 0; _i1 < _map0.size; ++_i1)
                {
                  String _key2; // required
                  ByteBuffer _val3; // optional
                  _key2 = iprot.readString();
                  _val3 = iprot.readBinary();
                  struct.requestedValues.put(_key2, _val3);
                }
                iprot.readMapEnd();
              }
              struct.setRequestedValuesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TwoPLTransactionResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.requestedValues != null) {
        oprot.writeFieldBegin(REQUESTED_VALUES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.requestedValues.size()));
          for (Map.Entry<String, ByteBuffer> _iter4 : struct.requestedValues.entrySet())
          {
            oprot.writeString(_iter4.getKey());
            oprot.writeBinary(_iter4.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TwoPLTransactionResultTupleSchemeFactory implements SchemeFactory {
    public TwoPLTransactionResultTupleScheme getScheme() {
      return new TwoPLTransactionResultTupleScheme();
    }
  }

  private static class TwoPLTransactionResultTupleScheme extends TupleScheme<TwoPLTransactionResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TwoPLTransactionResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRequestedValues()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetRequestedValues()) {
        {
          oprot.writeI32(struct.requestedValues.size());
          for (Map.Entry<String, ByteBuffer> _iter5 : struct.requestedValues.entrySet())
          {
            oprot.writeString(_iter5.getKey());
            oprot.writeBinary(_iter5.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TwoPLTransactionResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.requestedValues = new HashMap<String,ByteBuffer>(2*_map6.size);
          for (int _i7 = 0; _i7 < _map6.size; ++_i7)
          {
            String _key8; // required
            ByteBuffer _val9; // optional
            _key8 = iprot.readString();
            _val9 = iprot.readBinary();
            struct.requestedValues.put(_key8, _val9);
          }
        }
        struct.setRequestedValuesIsSet(true);
      }
    }
  }

}
