// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.simple.SimpleMessage in simple_message.proto
@file:Suppress("DEPRECATION")

package com.squareup.wire.protos.kotlin.simple

import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireEnum
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmStatic
import com.squareup.wire.`internal`.immutableCopyOf
import com.squareup.wire.`internal`.missingRequiredFields
import com.squareup.wire.`internal`.sanitize
import com.squareup.wire.protos.kotlin.foreign.ForeignEnum
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import okio.ByteString

/**
 * A message for testing.
 */
public class SimpleMessage(
  /**
   * An optional int32 //&#42;we should escape that comment*
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    schemaIndex = 0,
  )
  public val optional_int32: Int? = null,
  /**
   * An optional NestedMessage, *deprecated&#42;//
   */
  @Deprecated(message = "optional_nested_msg is deprecated")
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.protos.kotlin.simple.SimpleMessage${'$'}NestedMessage#ADAPTER",
    schemaIndex = 1,
  )
  public val optional_nested_msg: NestedMessage? = null,
  /**
   * An optional ExternalMessage
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.protos.kotlin.simple.ExternalMessage#ADAPTER",
    schemaIndex = 2,
  )
  public val optional_external_msg: ExternalMessage? = null,
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.protos.kotlin.simple.SimpleMessage${'$'}NestedEnum#ADAPTER",
    schemaIndex = 3,
  )
  public val default_nested_enum: NestedEnum? = null,
  /**
   * A required int32
   */
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.REQUIRED,
    schemaIndex = 4,
  )
  public val required_int32: Int,
  repeated_double: List<Double> = emptyList(),
  /**
   * enum from another package with an explicit default
   */
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.protos.kotlin.foreign.ForeignEnum#ADAPTER",
    schemaIndex = 6,
  )
  public val default_foreign_enum: ForeignEnum? = null,
  /**
   * enum from another package without an explicit default
   */
  @field:WireField(
    tag = 8,
    adapter = "com.squareup.wire.protos.kotlin.foreign.ForeignEnum#ADAPTER",
    schemaIndex = 7,
  )
  public val no_default_foreign_enum: ForeignEnum? = null,
  /**
   * field with the same name as a Java keyword
   */
  @field:WireField(
    tag = 9,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    declaredName = "package",
    schemaIndex = 8,
  )
  public val package_: String? = null,
  /**
   * field with the name "result"
   */
  @field:WireField(
    tag = 10,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 9,
  )
  public val result: String? = null,
  /**
   * field with the name "other"
   */
  @field:WireField(
    tag = 11,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 10,
  )
  public val other: String? = null,
  /**
   * field with the name "o"
   */
  @field:WireField(
    tag = 12,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 11,
  )
  public val o: String? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<SimpleMessage, Nothing>(ADAPTER, unknownFields) {
  /**
   * A repeated double, deprecated
   */
  @Deprecated(message = "repeated_double is deprecated")
  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#DOUBLE",
    label = WireField.Label.REPEATED,
    schemaIndex = 5,
  )
  public val repeated_double: List<Double> = immutableCopyOf("repeated_double", repeated_double)

  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other_: Any?): Boolean {
    if (other_ === this) return true
    if (other_ !is SimpleMessage) return false
    if (unknownFields != other_.unknownFields) return false
    if (optional_int32 != other_.optional_int32) return false
    if (optional_nested_msg != other_.optional_nested_msg) return false
    if (optional_external_msg != other_.optional_external_msg) return false
    if (default_nested_enum != other_.default_nested_enum) return false
    if (required_int32 != other_.required_int32) return false
    if (repeated_double != other_.repeated_double) return false
    if (default_foreign_enum != other_.default_foreign_enum) return false
    if (no_default_foreign_enum != other_.no_default_foreign_enum) return false
    if (package_ != other_.package_) return false
    if (result != other_.result) return false
    if (other != other_.other) return false
    if (o != other_.o) return false
    return true
  }

  override fun hashCode(): Int {
    var result_ = super.hashCode
    if (result_ == 0) {
      result_ = unknownFields.hashCode()
      result_ = result_ * 37 + (optional_int32?.hashCode() ?: 0)
      result_ = result_ * 37 + (optional_nested_msg?.hashCode() ?: 0)
      result_ = result_ * 37 + (optional_external_msg?.hashCode() ?: 0)
      result_ = result_ * 37 + (default_nested_enum?.hashCode() ?: 0)
      result_ = result_ * 37 + required_int32.hashCode()
      result_ = result_ * 37 + repeated_double.hashCode()
      result_ = result_ * 37 + (default_foreign_enum?.hashCode() ?: 0)
      result_ = result_ * 37 + (no_default_foreign_enum?.hashCode() ?: 0)
      result_ = result_ * 37 + (package_?.hashCode() ?: 0)
      result_ = result_ * 37 + (result?.hashCode() ?: 0)
      result_ = result_ * 37 + (other?.hashCode() ?: 0)
      result_ = result_ * 37 + (o?.hashCode() ?: 0)
      super.hashCode = result_
    }
    return result_
  }

  override fun toString(): String {
    val result_ = mutableListOf<String>()
    if (optional_int32 != null) result_ += """optional_int32=$optional_int32"""
    if (optional_nested_msg != null) result_ += """optional_nested_msg=$optional_nested_msg"""
    if (optional_external_msg != null) result_ += """optional_external_msg=$optional_external_msg"""
    if (default_nested_enum != null) result_ += """default_nested_enum=$default_nested_enum"""
    result_ += """required_int32=$required_int32"""
    if (repeated_double.isNotEmpty()) result_ += """repeated_double=$repeated_double"""
    if (default_foreign_enum != null) result_ += """default_foreign_enum=$default_foreign_enum"""
    if (no_default_foreign_enum != null) result_ +=
        """no_default_foreign_enum=$no_default_foreign_enum"""
    if (package_ != null) result_ += """package_=${sanitize(package_)}"""
    if (result != null) result_ += """result=${sanitize(result)}"""
    if (other != null) result_ += """other=${sanitize(other)}"""
    if (o != null) result_ += """o=${sanitize(o)}"""
    return result_.joinToString(prefix = "SimpleMessage{", separator = ", ", postfix = "}")
  }

  public fun copy(
    optional_int32: Int? = this.optional_int32,
    optional_nested_msg: NestedMessage? = this.optional_nested_msg,
    optional_external_msg: ExternalMessage? = this.optional_external_msg,
    default_nested_enum: NestedEnum? = this.default_nested_enum,
    required_int32: Int = this.required_int32,
    repeated_double: List<Double> = this.repeated_double,
    default_foreign_enum: ForeignEnum? = this.default_foreign_enum,
    no_default_foreign_enum: ForeignEnum? = this.no_default_foreign_enum,
    package_: String? = this.package_,
    result: String? = this.result,
    other: String? = this.other,
    o: String? = this.o,
    unknownFields: ByteString = this.unknownFields,
  ): SimpleMessage = SimpleMessage(optional_int32, optional_nested_msg, optional_external_msg,
      default_nested_enum, required_int32, repeated_double, default_foreign_enum,
      no_default_foreign_enum, package_, result, other, o, unknownFields)

  public companion object {
    public const val DEFAULT_OPTIONAL_INT32: Int = 123

    @JvmField
    public val DEFAULT_DEFAULT_NESTED_ENUM: NestedEnum = NestedEnum.BAZ

    public const val DEFAULT_REQUIRED_INT32: Int = 456

    @JvmField
    public val DEFAULT_DEFAULT_FOREIGN_ENUM: ForeignEnum = ForeignEnum.BAX

    @JvmField
    public val ADAPTER: ProtoAdapter<SimpleMessage> = object : ProtoAdapter<SimpleMessage>(
      FieldEncoding.LENGTH_DELIMITED, 
      SimpleMessage::class, 
      "type.googleapis.com/squareup.protos.kotlin.simple.SimpleMessage", 
      PROTO_2, 
      null, 
      "simple_message.proto"
    ) {
      override fun encodedSize(`value`: SimpleMessage): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.INT32.encodedSizeWithTag(1, value.optional_int32)
        size += NestedMessage.ADAPTER.encodedSizeWithTag(2, value.optional_nested_msg)
        size += ExternalMessage.ADAPTER.encodedSizeWithTag(3, value.optional_external_msg)
        size += NestedEnum.ADAPTER.encodedSizeWithTag(4, value.default_nested_enum)
        size += ProtoAdapter.INT32.encodedSizeWithTag(5, value.required_int32)
        size += ProtoAdapter.DOUBLE.asRepeated().encodedSizeWithTag(6, value.repeated_double)
        size += ForeignEnum.ADAPTER.encodedSizeWithTag(7, value.default_foreign_enum)
        size += ForeignEnum.ADAPTER.encodedSizeWithTag(8, value.no_default_foreign_enum)
        size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.package_)
        size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.result)
        size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.other)
        size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.o)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: SimpleMessage) {
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.optional_int32)
        NestedMessage.ADAPTER.encodeWithTag(writer, 2, value.optional_nested_msg)
        ExternalMessage.ADAPTER.encodeWithTag(writer, 3, value.optional_external_msg)
        NestedEnum.ADAPTER.encodeWithTag(writer, 4, value.default_nested_enum)
        ProtoAdapter.INT32.encodeWithTag(writer, 5, value.required_int32)
        ProtoAdapter.DOUBLE.asRepeated().encodeWithTag(writer, 6, value.repeated_double)
        ForeignEnum.ADAPTER.encodeWithTag(writer, 7, value.default_foreign_enum)
        ForeignEnum.ADAPTER.encodeWithTag(writer, 8, value.no_default_foreign_enum)
        ProtoAdapter.STRING.encodeWithTag(writer, 9, value.package_)
        ProtoAdapter.STRING.encodeWithTag(writer, 10, value.result)
        ProtoAdapter.STRING.encodeWithTag(writer, 11, value.other)
        ProtoAdapter.STRING.encodeWithTag(writer, 12, value.o)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: SimpleMessage) {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.STRING.encodeWithTag(writer, 12, value.o)
        ProtoAdapter.STRING.encodeWithTag(writer, 11, value.other)
        ProtoAdapter.STRING.encodeWithTag(writer, 10, value.result)
        ProtoAdapter.STRING.encodeWithTag(writer, 9, value.package_)
        ForeignEnum.ADAPTER.encodeWithTag(writer, 8, value.no_default_foreign_enum)
        ForeignEnum.ADAPTER.encodeWithTag(writer, 7, value.default_foreign_enum)
        ProtoAdapter.DOUBLE.asRepeated().encodeWithTag(writer, 6, value.repeated_double)
        ProtoAdapter.INT32.encodeWithTag(writer, 5, value.required_int32)
        NestedEnum.ADAPTER.encodeWithTag(writer, 4, value.default_nested_enum)
        ExternalMessage.ADAPTER.encodeWithTag(writer, 3, value.optional_external_msg)
        NestedMessage.ADAPTER.encodeWithTag(writer, 2, value.optional_nested_msg)
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.optional_int32)
      }

      override fun decode(reader: ProtoReader): SimpleMessage {
        var optional_int32: Int? = null
        var optional_nested_msg: NestedMessage? = null
        var optional_external_msg: ExternalMessage? = null
        var default_nested_enum: NestedEnum? = null
        var required_int32: Int? = null
        val repeated_double = mutableListOf<Double>()
        var default_foreign_enum: ForeignEnum? = null
        var no_default_foreign_enum: ForeignEnum? = null
        var package_: String? = null
        var result: String? = null
        var other: String? = null
        var o: String? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> optional_int32 = ProtoAdapter.INT32.decode(reader)
            2 -> optional_nested_msg = NestedMessage.ADAPTER.decode(reader)
            3 -> optional_external_msg = ExternalMessage.ADAPTER.decode(reader)
            4 -> try {
              default_nested_enum = NestedEnum.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            5 -> required_int32 = ProtoAdapter.INT32.decode(reader)
            6 -> repeated_double.add(ProtoAdapter.DOUBLE.decode(reader))
            7 -> try {
              default_foreign_enum = ForeignEnum.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            8 -> try {
              no_default_foreign_enum = ForeignEnum.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            9 -> package_ = ProtoAdapter.STRING.decode(reader)
            10 -> result = ProtoAdapter.STRING.decode(reader)
            11 -> other = ProtoAdapter.STRING.decode(reader)
            12 -> o = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return SimpleMessage(
          optional_int32 = optional_int32,
          optional_nested_msg = optional_nested_msg,
          optional_external_msg = optional_external_msg,
          default_nested_enum = default_nested_enum,
          required_int32 = required_int32 ?: throw missingRequiredFields(required_int32,
              "required_int32"),
          repeated_double = repeated_double,
          default_foreign_enum = default_foreign_enum,
          no_default_foreign_enum = no_default_foreign_enum,
          package_ = package_,
          result = result,
          other = other,
          o = o,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: SimpleMessage): SimpleMessage = value.copy(
        optional_nested_msg = value.optional_nested_msg?.let(NestedMessage.ADAPTER::redact),
        optional_external_msg = value.optional_external_msg?.let(ExternalMessage.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }

  public class NestedMessage(
    /**
     * An optional int32
     */
    @field:WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      schemaIndex = 0,
    )
    public val bb: Int? = null,
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<NestedMessage, Nothing>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN,
    )
    override fun newBuilder(): Nothing = throw
        AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

    override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is NestedMessage) return false
      if (unknownFields != other.unknownFields) return false
      if (bb != other.bb) return false
      return true
    }

    override fun hashCode(): Int {
      var result = super.hashCode
      if (result == 0) {
        result = unknownFields.hashCode()
        result = result * 37 + (bb?.hashCode() ?: 0)
        super.hashCode = result
      }
      return result
    }

    override fun toString(): String {
      val result = mutableListOf<String>()
      if (bb != null) result += """bb=$bb"""
      return result.joinToString(prefix = "NestedMessage{", separator = ", ", postfix = "}")
    }

    public fun copy(bb: Int? = this.bb, unknownFields: ByteString = this.unknownFields):
        NestedMessage = NestedMessage(bb, unknownFields)

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<NestedMessage> = object : ProtoAdapter<NestedMessage>(
        FieldEncoding.LENGTH_DELIMITED, 
        NestedMessage::class, 
        "type.googleapis.com/squareup.protos.kotlin.simple.SimpleMessage.NestedMessage", 
        PROTO_2, 
        null, 
        "simple_message.proto"
      ) {
        override fun encodedSize(`value`: NestedMessage): Int {
          var size = value.unknownFields.size
          size += ProtoAdapter.INT32.encodedSizeWithTag(1, value.bb)
          return size
        }

        override fun encode(writer: ProtoWriter, `value`: NestedMessage) {
          ProtoAdapter.INT32.encodeWithTag(writer, 1, value.bb)
          writer.writeBytes(value.unknownFields)
        }

        override fun encode(writer: ReverseProtoWriter, `value`: NestedMessage) {
          writer.writeBytes(value.unknownFields)
          ProtoAdapter.INT32.encodeWithTag(writer, 1, value.bb)
        }

        override fun decode(reader: ProtoReader): NestedMessage {
          var bb: Int? = null
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              1 -> bb = ProtoAdapter.INT32.decode(reader)
              else -> reader.readUnknownField(tag)
            }
          }
          return NestedMessage(
            bb = bb,
            unknownFields = unknownFields
          )
        }

        override fun redact(`value`: NestedMessage): NestedMessage = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L
    }
  }

  public enum class NestedEnum(
    override val `value`: Int,
  ) : WireEnum {
    FOO(1),
    BAR(2),
    BAZ(3),
    @Deprecated(message = "BUZ is deprecated")
    BUZ(3),
    ;

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<NestedEnum> = object : EnumAdapter<NestedEnum>(
        NestedEnum::class, 
        PROTO_2, 
        null
      ) {
        override fun fromValue(`value`: Int): NestedEnum? = NestedEnum.fromValue(value)
      }

      @JvmStatic
      public fun fromValue(`value`: Int): NestedEnum? = when (value) {
        1 -> FOO
        2 -> BAR
        3 -> BAZ
        3 -> @Suppress("DEPRECATION") BUZ
        else -> null
      }
    }
  }
}
