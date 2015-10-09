/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sikuli.natives;

public class FindInput {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected FindInput(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FindInput obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        VisionProxyJNI.delete_FindInput(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public FindInput() {
    this(VisionProxyJNI.new_FindInput__SWIG_0(), true);
  }

  public FindInput(Mat source, Mat target) {
    this(VisionProxyJNI.new_FindInput__SWIG_1(Mat.getCPtr(source), source, Mat.getCPtr(target), target), true);
  }

  public FindInput(Mat source, int target_type, String target) {
    this(VisionProxyJNI.new_FindInput__SWIG_2(Mat.getCPtr(source), source, target_type, target), true);
  }

  public FindInput(String source_filename, int target_type, String target) {
    this(VisionProxyJNI.new_FindInput__SWIG_3(source_filename, target_type, target), true);
  }

  public FindInput(Mat source, int target_type) {
    this(VisionProxyJNI.new_FindInput__SWIG_4(Mat.getCPtr(source), source, target_type), true);
  }

  public FindInput(String source_filename, int target_type) {
    this(VisionProxyJNI.new_FindInput__SWIG_5(source_filename, target_type), true);
  }

  public FindInput(Mat source, FindInput other) {
    this(VisionProxyJNI.new_FindInput__SWIG_6(Mat.getCPtr(source), source, FindInput.getCPtr(other), other), true);
  }

  public void setSource(String source_filename) {
    VisionProxyJNI.FindInput_setSource__SWIG_0(swigCPtr, this, source_filename);
  }

  public void setTarget(int target_type, String target_string) {
    VisionProxyJNI.FindInput_setTarget__SWIG_0(swigCPtr, this, target_type, target_string);
  }

  public void setSource(Mat source) {
    VisionProxyJNI.FindInput_setSource__SWIG_1(swigCPtr, this, Mat.getCPtr(source), source);
  }

  public void setTarget(Mat target) {
    VisionProxyJNI.FindInput_setTarget__SWIG_1(swigCPtr, this, Mat.getCPtr(target), target);
  }

  public Mat getSourceMat() {
    return new Mat(VisionProxyJNI.FindInput_getSourceMat(swigCPtr, this), true);
  }

  public Mat getTargetMat() {
    return new Mat(VisionProxyJNI.FindInput_getTargetMat(swigCPtr, this), true);
  }

  public void setFindAll(boolean all) {
    VisionProxyJNI.FindInput_setFindAll(swigCPtr, this, all);
  }

  public boolean isFindingAll() {
    return VisionProxyJNI.FindInput_isFindingAll(swigCPtr, this);
  }

  public void setLimit(int limit) {
    VisionProxyJNI.FindInput_setLimit(swigCPtr, this, limit);
  }

  public int getLimit() {
    return VisionProxyJNI.FindInput_getLimit(swigCPtr, this);
  }

  public void setSimilarity(double similarity) {
    VisionProxyJNI.FindInput_setSimilarity(swigCPtr, this, similarity);
  }

  public double getSimilarity() {
    return VisionProxyJNI.FindInput_getSimilarity(swigCPtr, this);
  }

  public int getTargetType() {
    return VisionProxyJNI.FindInput_getTargetType(swigCPtr, this);
  }

  public String getTargetText() {
    return VisionProxyJNI.FindInput_getTargetText(swigCPtr, this);
  }

}
