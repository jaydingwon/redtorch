/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v16t1v.api;

public class CThostFtdcCurrDRIdentityField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCurrDRIdentityField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCurrDRIdentityField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v3v16t1x64apiJNI.delete_CThostFtdcCurrDRIdentityField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDRIdentityID(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCurrDRIdentityField_DRIdentityID_set(swigCPtr, this, value);
  }

  public int getDRIdentityID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCurrDRIdentityField_DRIdentityID_get(swigCPtr, this);
  }

  public CThostFtdcCurrDRIdentityField() {
    this(jctpv6v3v16t1x64apiJNI.new_CThostFtdcCurrDRIdentityField(), true);
  }

}
