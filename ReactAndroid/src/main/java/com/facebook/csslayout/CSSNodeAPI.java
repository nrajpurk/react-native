/**
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.csslayout;

public interface CSSNodeAPI<CSSNodeType extends CSSNodeAPI> {

  interface MeasureFunction {
    /**
     * Return a value created by MeasureOutput.make(width, height);
     */
    long measure(
        CSSNodeAPI node,
        float width,
        CSSMeasureMode widthMode,
        float height,
        CSSMeasureMode heightMode);
  }

  int getChildCount();
  CSSNodeType getChildAt(int i);
  void addChildAt(CSSNodeType child, int i);
  CSSNodeType removeChildAt(int i);
  CSSNodeType getParent();
  int indexOf(CSSNodeType child);
  void setMeasureFunction(MeasureFunction measureFunction);
  boolean isMeasureDefined();
  void calculateLayout();
  boolean isDirty();
  boolean hasNewLayout();
  void dirty();
  void markLayoutSeen();
  void copyStyle(CSSNodeType srcNode);
  CSSDirection getStyleDirection();
  void setDirection(CSSDirection direction);
  CSSFlexDirection getFlexDirection();
  void setFlexDirection(CSSFlexDirection flexDirection);
  CSSJustify getJustifyContent();
  void setJustifyContent(CSSJustify justifyContent);
  CSSAlign getAlignItems();
  void setAlignItems(CSSAlign alignItems);
  CSSAlign getAlignSelf();
  void setAlignSelf(CSSAlign alignSelf);
  CSSAlign getAlignContent();
  void setAlignContent(CSSAlign alignContent);
  CSSPositionType getPositionType();
  void setPositionType(CSSPositionType positionType);
  void setWrap(CSSWrap flexWrap);
  void setFlex(float flex);
  float getFlexGrow();
  void setFlexGrow(float flexGrow);
  float getFlexShrink();
  void setFlexShrink(float flexShrink);
  float getFlexBasis();
  void setFlexBasis(float flexBasis);
  float getMargin(CSSEdge edge);
  void setMargin(CSSEdge edge, float margin);
  float getPadding(CSSEdge edge);
  void setPadding(CSSEdge edge, float padding);
  float getBorder(CSSEdge edge);
  void setBorder(CSSEdge edge, float border);
  float getPosition(CSSEdge edge);
  void setPosition(CSSEdge edge, float position);
  float getWidth();
  void setWidth(float width);
  float getHeight();
  void setHeight(float height);
  float getMaxWidth();
  void setMaxWidth(float maxWidth);
  float getMinWidth();
  void setMinWidth(float minWidth);
  float getMaxHeight();
  void setMaxHeight(float maxHeight);
  float getMinHeight();
  void setMinHeight(float minHeight);
  float getLayoutX();
  float getLayoutY();
  float getLayoutWidth();
  float getLayoutHeight();
  CSSDirection getLayoutDirection();
  CSSOverflow getOverflow();
  void setOverflow(CSSOverflow overflow);
  void setData(Object data);
  Object getData();
  void reset();
}
