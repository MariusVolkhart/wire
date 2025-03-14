// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.DeprecatedProto in deprecated.proto
import Foundation
import Wire

public struct DeprecatedProto {

    @available(*, deprecated)
    @ProtoDefaulted
    public var foo: String?
    public var unknownFields: Foundation.Data = .init()

    public init(configure: (inout Self) -> Swift.Void = { _ in }) {
        configure(&self)
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension DeprecatedProto : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension DeprecatedProto : Hashable {
}
#endif

extension DeprecatedProto : Sendable {
}

extension DeprecatedProto : ProtoDefaultedValue {

    public static var defaultedValue: DeprecatedProto {
        DeprecatedProto()
    }
}

extension DeprecatedProto : ProtoMessage {

    public static func protoMessageTypeURL() -> String {
        return "type.googleapis.com/squareup.protos.kotlin.DeprecatedProto"
    }

}

extension DeprecatedProto : Proto2Codable {

    public init(from protoReader: ProtoReader) throws {
        var foo: String? = nil

        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            case 1: foo = try protoReader.decode(String.self)
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

        self._foo.wrappedValue = foo
    }

    public func encode(to protoWriter: ProtoWriter) throws {
        try protoWriter.encode(tag: 1, value: self.foo)
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension DeprecatedProto : Codable {

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: StringLiteralCodingKeys.self)
        self._foo.wrappedValue = try container.decodeIfPresent(String.self, forKey: "foo")
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: StringLiteralCodingKeys.self)

        try container.encodeIfPresent(self.foo, forKey: "foo")
    }

}
#endif
