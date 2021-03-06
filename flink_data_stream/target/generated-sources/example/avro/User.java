/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package example.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class User extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3878198765416803602L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"example.avro\",\"fields\":[{\"name\":\"CSLVersion\",\"type\":[\"string\",\"null\"],\"default\":\"\"},{\"name\":\"CSLSeqNum\",\"type\":[\"string\",\"null\"],\"default\":\"\"},{\"name\":\"CRNTI\",\"type\":[\"string\",\"null\"],\"default\":\"\"},{\"name\":\"MMEUES1APID\",\"type\":[\"string\",\"null\"],\"default\":\"\"},{\"name\":\"eNBUES1APID\",\"type\":[\"string\",\"null\"],\"default\":\"\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<User> ENCODER =
      new BinaryMessageEncoder<User>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<User> DECODER =
      new BinaryMessageDecoder<User>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<User> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<User> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<User> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<User>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this User to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a User from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a User instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static User fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence CSLVersion;
   private java.lang.CharSequence CSLSeqNum;
   private java.lang.CharSequence CRNTI;
   private java.lang.CharSequence MMEUES1APID;
   private java.lang.CharSequence eNBUES1APID;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public User() {}

  /**
   * All-args constructor.
   * @param CSLVersion The new value for CSLVersion
   * @param CSLSeqNum The new value for CSLSeqNum
   * @param CRNTI The new value for CRNTI
   * @param MMEUES1APID The new value for MMEUES1APID
   * @param eNBUES1APID The new value for eNBUES1APID
   */
  public User(java.lang.CharSequence CSLVersion, java.lang.CharSequence CSLSeqNum, java.lang.CharSequence CRNTI, java.lang.CharSequence MMEUES1APID, java.lang.CharSequence eNBUES1APID) {
    this.CSLVersion = CSLVersion;
    this.CSLSeqNum = CSLSeqNum;
    this.CRNTI = CRNTI;
    this.MMEUES1APID = MMEUES1APID;
    this.eNBUES1APID = eNBUES1APID;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return CSLVersion;
    case 1: return CSLSeqNum;
    case 2: return CRNTI;
    case 3: return MMEUES1APID;
    case 4: return eNBUES1APID;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: CSLVersion = (java.lang.CharSequence)value$; break;
    case 1: CSLSeqNum = (java.lang.CharSequence)value$; break;
    case 2: CRNTI = (java.lang.CharSequence)value$; break;
    case 3: MMEUES1APID = (java.lang.CharSequence)value$; break;
    case 4: eNBUES1APID = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'CSLVersion' field.
   * @return The value of the 'CSLVersion' field.
   */
  public java.lang.CharSequence getCSLVersion() {
    return CSLVersion;
  }


  /**
   * Sets the value of the 'CSLVersion' field.
   * @param value the value to set.
   */
  public void setCSLVersion(java.lang.CharSequence value) {
    this.CSLVersion = value;
  }

  /**
   * Gets the value of the 'CSLSeqNum' field.
   * @return The value of the 'CSLSeqNum' field.
   */
  public java.lang.CharSequence getCSLSeqNum() {
    return CSLSeqNum;
  }


  /**
   * Sets the value of the 'CSLSeqNum' field.
   * @param value the value to set.
   */
  public void setCSLSeqNum(java.lang.CharSequence value) {
    this.CSLSeqNum = value;
  }

  /**
   * Gets the value of the 'CRNTI' field.
   * @return The value of the 'CRNTI' field.
   */
  public java.lang.CharSequence getCRNTI() {
    return CRNTI;
  }


  /**
   * Sets the value of the 'CRNTI' field.
   * @param value the value to set.
   */
  public void setCRNTI(java.lang.CharSequence value) {
    this.CRNTI = value;
  }

  /**
   * Gets the value of the 'MMEUES1APID' field.
   * @return The value of the 'MMEUES1APID' field.
   */
  public java.lang.CharSequence getMMEUES1APID() {
    return MMEUES1APID;
  }


  /**
   * Sets the value of the 'MMEUES1APID' field.
   * @param value the value to set.
   */
  public void setMMEUES1APID(java.lang.CharSequence value) {
    this.MMEUES1APID = value;
  }

  /**
   * Gets the value of the 'eNBUES1APID' field.
   * @return The value of the 'eNBUES1APID' field.
   */
  public java.lang.CharSequence getENBUES1APID() {
    return eNBUES1APID;
  }


  /**
   * Sets the value of the 'eNBUES1APID' field.
   * @param value the value to set.
   */
  public void setENBUES1APID(java.lang.CharSequence value) {
    this.eNBUES1APID = value;
  }

  /**
   * Creates a new User RecordBuilder.
   * @return A new User RecordBuilder
   */
  public static example.avro.User.Builder newBuilder() {
    return new example.avro.User.Builder();
  }

  /**
   * Creates a new User RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new User RecordBuilder
   */
  public static example.avro.User.Builder newBuilder(example.avro.User.Builder other) {
    if (other == null) {
      return new example.avro.User.Builder();
    } else {
      return new example.avro.User.Builder(other);
    }
  }

  /**
   * Creates a new User RecordBuilder by copying an existing User instance.
   * @param other The existing instance to copy.
   * @return A new User RecordBuilder
   */
  public static example.avro.User.Builder newBuilder(example.avro.User other) {
    if (other == null) {
      return new example.avro.User.Builder();
    } else {
      return new example.avro.User.Builder(other);
    }
  }

  /**
   * RecordBuilder for User instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

    private java.lang.CharSequence CSLVersion;
    private java.lang.CharSequence CSLSeqNum;
    private java.lang.CharSequence CRNTI;
    private java.lang.CharSequence MMEUES1APID;
    private java.lang.CharSequence eNBUES1APID;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(example.avro.User.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.CSLVersion)) {
        this.CSLVersion = data().deepCopy(fields()[0].schema(), other.CSLVersion);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.CSLSeqNum)) {
        this.CSLSeqNum = data().deepCopy(fields()[1].schema(), other.CSLSeqNum);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.CRNTI)) {
        this.CRNTI = data().deepCopy(fields()[2].schema(), other.CRNTI);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.MMEUES1APID)) {
        this.MMEUES1APID = data().deepCopy(fields()[3].schema(), other.MMEUES1APID);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.eNBUES1APID)) {
        this.eNBUES1APID = data().deepCopy(fields()[4].schema(), other.eNBUES1APID);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing User instance
     * @param other The existing instance to copy.
     */
    private Builder(example.avro.User other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.CSLVersion)) {
        this.CSLVersion = data().deepCopy(fields()[0].schema(), other.CSLVersion);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.CSLSeqNum)) {
        this.CSLSeqNum = data().deepCopy(fields()[1].schema(), other.CSLSeqNum);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.CRNTI)) {
        this.CRNTI = data().deepCopy(fields()[2].schema(), other.CRNTI);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.MMEUES1APID)) {
        this.MMEUES1APID = data().deepCopy(fields()[3].schema(), other.MMEUES1APID);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.eNBUES1APID)) {
        this.eNBUES1APID = data().deepCopy(fields()[4].schema(), other.eNBUES1APID);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'CSLVersion' field.
      * @return The value.
      */
    public java.lang.CharSequence getCSLVersion() {
      return CSLVersion;
    }


    /**
      * Sets the value of the 'CSLVersion' field.
      * @param value The value of 'CSLVersion'.
      * @return This builder.
      */
    public example.avro.User.Builder setCSLVersion(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.CSLVersion = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'CSLVersion' field has been set.
      * @return True if the 'CSLVersion' field has been set, false otherwise.
      */
    public boolean hasCSLVersion() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'CSLVersion' field.
      * @return This builder.
      */
    public example.avro.User.Builder clearCSLVersion() {
      CSLVersion = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'CSLSeqNum' field.
      * @return The value.
      */
    public java.lang.CharSequence getCSLSeqNum() {
      return CSLSeqNum;
    }


    /**
      * Sets the value of the 'CSLSeqNum' field.
      * @param value The value of 'CSLSeqNum'.
      * @return This builder.
      */
    public example.avro.User.Builder setCSLSeqNum(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.CSLSeqNum = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'CSLSeqNum' field has been set.
      * @return True if the 'CSLSeqNum' field has been set, false otherwise.
      */
    public boolean hasCSLSeqNum() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'CSLSeqNum' field.
      * @return This builder.
      */
    public example.avro.User.Builder clearCSLSeqNum() {
      CSLSeqNum = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'CRNTI' field.
      * @return The value.
      */
    public java.lang.CharSequence getCRNTI() {
      return CRNTI;
    }


    /**
      * Sets the value of the 'CRNTI' field.
      * @param value The value of 'CRNTI'.
      * @return This builder.
      */
    public example.avro.User.Builder setCRNTI(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.CRNTI = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'CRNTI' field has been set.
      * @return True if the 'CRNTI' field has been set, false otherwise.
      */
    public boolean hasCRNTI() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'CRNTI' field.
      * @return This builder.
      */
    public example.avro.User.Builder clearCRNTI() {
      CRNTI = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'MMEUES1APID' field.
      * @return The value.
      */
    public java.lang.CharSequence getMMEUES1APID() {
      return MMEUES1APID;
    }


    /**
      * Sets the value of the 'MMEUES1APID' field.
      * @param value The value of 'MMEUES1APID'.
      * @return This builder.
      */
    public example.avro.User.Builder setMMEUES1APID(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.MMEUES1APID = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'MMEUES1APID' field has been set.
      * @return True if the 'MMEUES1APID' field has been set, false otherwise.
      */
    public boolean hasMMEUES1APID() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'MMEUES1APID' field.
      * @return This builder.
      */
    public example.avro.User.Builder clearMMEUES1APID() {
      MMEUES1APID = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'eNBUES1APID' field.
      * @return The value.
      */
    public java.lang.CharSequence getENBUES1APID() {
      return eNBUES1APID;
    }


    /**
      * Sets the value of the 'eNBUES1APID' field.
      * @param value The value of 'eNBUES1APID'.
      * @return This builder.
      */
    public example.avro.User.Builder setENBUES1APID(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.eNBUES1APID = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'eNBUES1APID' field has been set.
      * @return True if the 'eNBUES1APID' field has been set, false otherwise.
      */
    public boolean hasENBUES1APID() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'eNBUES1APID' field.
      * @return This builder.
      */
    public example.avro.User.Builder clearENBUES1APID() {
      eNBUES1APID = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public User build() {
      try {
        User record = new User();
        record.CSLVersion = fieldSetFlags()[0] ? this.CSLVersion : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.CSLSeqNum = fieldSetFlags()[1] ? this.CSLSeqNum : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.CRNTI = fieldSetFlags()[2] ? this.CRNTI : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.MMEUES1APID = fieldSetFlags()[3] ? this.MMEUES1APID : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.eNBUES1APID = fieldSetFlags()[4] ? this.eNBUES1APID : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<User>
    WRITER$ = (org.apache.avro.io.DatumWriter<User>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<User>
    READER$ = (org.apache.avro.io.DatumReader<User>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.CSLVersion == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.CSLVersion);
    }

    if (this.CSLSeqNum == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.CSLSeqNum);
    }

    if (this.CRNTI == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.CRNTI);
    }

    if (this.MMEUES1APID == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.MMEUES1APID);
    }

    if (this.eNBUES1APID == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.eNBUES1APID);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 0) {
        in.readNull();
        this.CSLVersion = null;
      } else {
        this.CSLVersion = in.readString(this.CSLVersion instanceof Utf8 ? (Utf8)this.CSLVersion : null);
      }

      if (in.readIndex() != 0) {
        in.readNull();
        this.CSLSeqNum = null;
      } else {
        this.CSLSeqNum = in.readString(this.CSLSeqNum instanceof Utf8 ? (Utf8)this.CSLSeqNum : null);
      }

      if (in.readIndex() != 0) {
        in.readNull();
        this.CRNTI = null;
      } else {
        this.CRNTI = in.readString(this.CRNTI instanceof Utf8 ? (Utf8)this.CRNTI : null);
      }

      if (in.readIndex() != 0) {
        in.readNull();
        this.MMEUES1APID = null;
      } else {
        this.MMEUES1APID = in.readString(this.MMEUES1APID instanceof Utf8 ? (Utf8)this.MMEUES1APID : null);
      }

      if (in.readIndex() != 0) {
        in.readNull();
        this.eNBUES1APID = null;
      } else {
        this.eNBUES1APID = in.readString(this.eNBUES1APID instanceof Utf8 ? (Utf8)this.eNBUES1APID : null);
      }

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 0) {
            in.readNull();
            this.CSLVersion = null;
          } else {
            this.CSLVersion = in.readString(this.CSLVersion instanceof Utf8 ? (Utf8)this.CSLVersion : null);
          }
          break;

        case 1:
          if (in.readIndex() != 0) {
            in.readNull();
            this.CSLSeqNum = null;
          } else {
            this.CSLSeqNum = in.readString(this.CSLSeqNum instanceof Utf8 ? (Utf8)this.CSLSeqNum : null);
          }
          break;

        case 2:
          if (in.readIndex() != 0) {
            in.readNull();
            this.CRNTI = null;
          } else {
            this.CRNTI = in.readString(this.CRNTI instanceof Utf8 ? (Utf8)this.CRNTI : null);
          }
          break;

        case 3:
          if (in.readIndex() != 0) {
            in.readNull();
            this.MMEUES1APID = null;
          } else {
            this.MMEUES1APID = in.readString(this.MMEUES1APID instanceof Utf8 ? (Utf8)this.MMEUES1APID : null);
          }
          break;

        case 4:
          if (in.readIndex() != 0) {
            in.readNull();
            this.eNBUES1APID = null;
          } else {
            this.eNBUES1APID = in.readString(this.eNBUES1APID instanceof Utf8 ? (Utf8)this.eNBUES1APID : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










