// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.person.Person in person.proto
import Foundation
import Wire

/**
 * Message representing a person, includes their name, unique ID number, email and phone number.
 */
public struct Person {

    /**
     * The customer's ID number.
     */
    public var id: Int32
    /**
     * The customer's full name.
     */
    public var name: String
    /**
     * Email address for the customer.
     */
    @ProtoDefaulted
    public var email: String?
    /**
     * A list of the customer's phone numbers.
     */
    public var phone: [Person.PhoneNumber] = []
    public var aliases: [String] = []
    public var unknownFields: Foundation.Data = .init()

    public init(
        id: Int32,
        name: String,
        configure: (inout Self) -> Swift.Void = { _ in }
    ) {
        self.id = id
        self.name = name
        configure(&self)
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension Person : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Person : Hashable {
}
#endif

#if swift(>=5.5)
extension Person : Sendable {
}
#endif

extension Person : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/squareup.protos.kotlin.person.Person"
    }

}

extension Person : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        var id: Swift.Int32? = nil
        var name: Swift.String? = nil
        var email: Swift.String? = nil
        var phone: [Person.PhoneNumber] = []
        var aliases: [Swift.String] = []

        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            case 2: id = try protoReader.decode(Swift.Int32.self)
            case 1: name = try protoReader.decode(Swift.String.self)
            case 3: email = try protoReader.decode(Swift.String.self)
            case 4: try protoReader.decode(into: &phone)
            case 5: try protoReader.decode(into: &aliases)
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

        self.id = try Person.checkIfMissing(id, "id")
        self.name = try Person.checkIfMissing(name, "name")
        self._email.wrappedValue = email
        self.phone = phone
        self.aliases = aliases
    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        try protoWriter.encode(tag: 2, value: self.id)
        try protoWriter.encode(tag: 1, value: self.name)
        try protoWriter.encode(tag: 3, value: self.email)
        try protoWriter.encode(tag: 4, value: self.phone)
        try protoWriter.encode(tag: 5, value: self.aliases)
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension Person : Codable {

    public init(from decoder: Swift.Decoder) throws {
        let container = try decoder.container(keyedBy: Wire.StringLiteralCodingKeys.self)
        self.id = try container.decode(Swift.Int32.self, forKey: "id")
        self.name = try container.decode(Swift.String.self, forKey: "name")
        self._email.wrappedValue = try container.decodeIfPresent(Swift.String.self, forKey: "email")
        self.phone = try container.decodeProtoArray(Person.PhoneNumber.self, forKey: "phone")
        self.aliases = try container.decodeProtoArray(Swift.String.self, forKey: "aliases")
    }

    public func encode(to encoder: Swift.Encoder) throws {
        var container = encoder.container(keyedBy: Wire.StringLiteralCodingKeys.self)
        let includeDefaults = encoder.protoDefaultValuesEncodingStrategy == .include

        if includeDefaults || self.id != 0 {
            try container.encode(self.id, forKey: "id")
        }
        if includeDefaults || !self.name.isEmpty {
            try container.encode(self.name, forKey: "name")
        }
        try container.encodeIfPresent(self.email, forKey: "email")
        if includeDefaults || !self.phone.isEmpty {
            try container.encodeProtoArray(self.phone, forKey: "phone")
        }
        if includeDefaults || !self.aliases.isEmpty {
            try container.encodeProtoArray(self.aliases, forKey: "aliases")
        }
    }

}
#endif

/**
 * Subtypes within Person
 */
extension Person {

    /**
     * Represents the type of the phone number: mobile, home or work.
     */
    public enum PhoneType : Swift.Int32, Swift.CaseIterable, Wire.ProtoEnum {

        case MOBILE = 0
        case HOME = 1
        /**
         * Could be phone or fax.
         */
        case WORK = 2

        public var description: Swift.String {
            switch self {
            case .MOBILE: return "MOBILE"
            case .HOME: return "HOME"
            case .WORK: return "WORK"
            }
        }

    }

    public struct PhoneNumber {

        /**
         * The customer's phone number.
         */
        public var number: Swift.String
        /**
         * The type of phone stored here.
         */
        @Wire.CustomDefaulted(defaultValue: Person.PhoneType.HOME)
        public var type: Person.PhoneType?
        public var unknownFields: Foundation.Data = .init()

        public init(number: Swift.String, configure: (inout Self) -> Swift.Void = { _ in }) {
            self.number = number
            configure(&self)
        }

    }

}

#if swift(>=5.5)
extension Person.PhoneType : Sendable {
}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Person.PhoneNumber : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Person.PhoneNumber : Hashable {
}
#endif

#if swift(>=5.5)
extension Person.PhoneNumber : Sendable {
}
#endif

extension Person.PhoneNumber : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/squareup.protos.kotlin.person.Person.PhoneNumber"
    }

}

extension Person.PhoneNumber : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        var number: Swift.String? = nil
        var type: Person.PhoneType? = nil

        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            case 1: number = try protoReader.decode(Swift.String.self)
            case 2: type = try protoReader.decode(Person.PhoneType.self)
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

        self.number = try Person.PhoneNumber.checkIfMissing(number, "number")
        self._type.wrappedValue = type
    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        try protoWriter.encode(tag: 1, value: self.number)
        try protoWriter.encode(tag: 2, value: self.type)
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension Person.PhoneNumber : Codable {

    public init(from decoder: Swift.Decoder) throws {
        let container = try decoder.container(keyedBy: Wire.StringLiteralCodingKeys.self)
        self.number = try container.decode(Swift.String.self, forKey: "number")
        self._type.wrappedValue = try container.decodeIfPresent(Person.PhoneType.self, forKey: "type")
    }

    public func encode(to encoder: Swift.Encoder) throws {
        var container = encoder.container(keyedBy: Wire.StringLiteralCodingKeys.self)
        let includeDefaults = encoder.protoDefaultValuesEncodingStrategy == .include

        if includeDefaults || !self.number.isEmpty {
            try container.encode(self.number, forKey: "number")
        }
        try container.encodeIfPresent(self.type, forKey: "type")
    }

}
#endif
