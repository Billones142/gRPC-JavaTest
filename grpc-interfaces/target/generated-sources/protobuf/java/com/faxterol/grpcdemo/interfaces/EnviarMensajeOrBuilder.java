// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: servicioGRPC.proto

package com.faxterol.grpcdemo.interfaces;

public interface EnviarMensajeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.faxterol.grpcdemo.interfaces.EnviarMensaje)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *el tipo de dato del campo (uint32), el nombre del campo (to) y el número de orden irrepetible del campo. Los campos más utilizados son los primeros. Una vez especificado el mensaje y en produccion, el orden de los campos no puede cambiar. (o si, pero meterás en problemas a los stubs.)
   * </pre>
   *
   * <code>uint32 to = 1;</code>
   * @return The to.
   */
  int getTo();

  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}