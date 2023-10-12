// Code generated by Wire protocol buffer compiler, do not edit.
// Source: com.squareup.wire.protos.kotlin.map.Thing in map.proto
import Foundation
import Wire

public struct Thing {

    public var name: String?
    public var unknownFields: Foundation.Data = .init()

    public init(configure: (inout Self) -> Swift.Void = { _ in }) {
        configure(&self)
    }

}

#if WIRE_INCLUDE_MEMBERWISE_INITIALIZER
extension Thing {

    @_disfavoredOverload
    @available(*, deprecated)
    public init(name: Swift.String? = nil) {
        self.name = name
    }

}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Thing : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Thing : Hashable {
}
#endif

#if swift(>=5.5)
extension Thing : Sendable {
}
#endif

extension Thing : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/com.squareup.wire.protos.kotlin.map.Thing"
    }

}

extension Thing : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        var name: Swift.String? = nil

        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            case 1: name = try protoReader.decode(Swift.String.self)
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

        self.name = name
    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        try protoWriter.encode(tag: 1, value: self.name)
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension Thing : Codable {

    public init(from decoder: Swift.Decoder) throws {
        let container = try decoder.container(keyedBy: Wire.StringLiteralCodingKeys.self)
        self.name = try container.decodeIfPresent(Swift.String.self, forKey: "name")
    }

    public func encode(to encoder: Swift.Encoder) throws {
        var container = encoder.container(keyedBy: Wire.StringLiteralCodingKeys.self)

        try container.encodeIfPresent(self.name, forKey: "name")
    }

}
#endif