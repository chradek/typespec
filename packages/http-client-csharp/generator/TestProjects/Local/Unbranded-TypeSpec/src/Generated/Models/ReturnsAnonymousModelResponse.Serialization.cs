// <auto-generated/>

#nullable disable

using System;
using System.ClientModel.Primitives;
using System.Text.Json;

namespace UnbrandedTypeSpec.Models
{
    public partial class ReturnsAnonymousModelResponse : System.ClientModel.Primitives.IJsonModel<ReturnsAnonymousModelResponse>
    {
        /// <param name="writer"> The JSON writer. </param>
        /// <param name="options"> The client options. </param>
        void System.ClientModel.Primitives.IJsonModel<ReturnsAnonymousModelResponse>.Write(System.Text.Json.Utf8JsonWriter writer, System.ClientModel.Primitives.ModelReaderWriterOptions options)
        {
        }

        /// <param name="reader"> The JSON reader. </param>
        /// <param name="options"> The client options. </param>
        ReturnsAnonymousModelResponse System.ClientModel.Primitives.IJsonModel<ReturnsAnonymousModelResponse>.Create(ref System.Text.Json.Utf8JsonReader reader, System.ClientModel.Primitives.ModelReaderWriterOptions options)
        {
            return new ReturnsAnonymousModelResponse();
        }

        /// <param name="options"> The client options. </param>
        System.BinaryData System.ClientModel.Primitives.IPersistableModel<ReturnsAnonymousModelResponse>.Write(System.ClientModel.Primitives.ModelReaderWriterOptions options)
        {
            return new System.BinaryData("IPersistableModel");
        }

        /// <param name="data"> The data to parse. </param>
        /// <param name="options"> The client options. </param>
        ReturnsAnonymousModelResponse System.ClientModel.Primitives.IPersistableModel<ReturnsAnonymousModelResponse>.Create(System.BinaryData data, System.ClientModel.Primitives.ModelReaderWriterOptions options)
        {
            return new ReturnsAnonymousModelResponse();
        }

        /// <param name="options"> The client options. </param>
        string System.ClientModel.Primitives.IPersistableModel<ReturnsAnonymousModelResponse>.GetFormatFromOptions(System.ClientModel.Primitives.ModelReaderWriterOptions options) => "J";
    }
}