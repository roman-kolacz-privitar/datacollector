/**
 * (c) 2015 StreamSets, Inc. All rights reserved. May not
 * be copied, modified, or distributed in whole or part without
 * written consent of StreamSets, Inc.
 */
package com.streamsets.datacollector.execution.preview.common;

import com.streamsets.datacollector.execution.PreviewOutput;
import com.streamsets.datacollector.execution.PreviewStatus;
import com.streamsets.datacollector.runner.StageOutput;
import com.streamsets.datacollector.validation.Issues;

import java.util.List;

public class PreviewOutputImpl implements PreviewOutput {

  private final PreviewStatus previewStatus;
  private final Issues issues;
  private final List<List<StageOutput>> output;
  private final String message;

  public PreviewOutputImpl(PreviewStatus previewStatus, Issues issues, List<List<StageOutput>> output, String message) {
    this.previewStatus = previewStatus;
    this.issues = issues;
    this.output = output;
    this.message = message;
  }

  @Override
  public PreviewStatus getStatus() {
    return previewStatus;
  }

  @Override
  public Issues getIssues() {
    return issues;
  }

  @Override
  public List<List<StageOutput>> getOutput() {
    return output;
  }

  @Override
  public String getMessage() {
    return message;
  }
}
