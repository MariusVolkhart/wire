// Code generated by Wire protocol buffer compiler, do not edit.
// Source: google.protobuf.OneofOptions in google/protobuf/descriptor.proto
import Foundation

public struct OneofOptions {

    public var unknownFields: Foundation.Data = .init()

    public init() {
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension OneofOptions : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension OneofOptions : Hashable {
}
#endif

extension OneofOptions : Sendable {
}

extension OneofOptions : ProtoDefaultedValue {

    public static var defaultedValue: OneofOptions {
        OneofOptions()
    }
}

extension OneofOptions : ProtoMessage {

    public static func protoMessageTypeURL() -> String {
        return "type.googleapis.com/google.protobuf.OneofOptions"
    }

}

extension OneofOptions : Proto2Codable {

    public init(from protoReader: ProtoReader) throws {
        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

    }

    public func encode(to protoWriter: ProtoWriter) throws {
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension OneofOptions : Codable {

    public enum CodingKeys : CodingKey {
    }

}
#endif
