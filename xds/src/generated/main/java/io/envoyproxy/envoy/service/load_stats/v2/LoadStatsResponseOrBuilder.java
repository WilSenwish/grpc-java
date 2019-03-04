// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/load_stats/v2/lrs.proto

package io.envoyproxy.envoy.service.load_stats.v2;

public interface LoadStatsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.load_stats.v2.LoadStatsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Clusters to report stats for.
   * </pre>
   *
   * <code>repeated string clusters = 1 [(.validate.rules) = { ... }</code>
   */
  java.util.List<java.lang.String>
      getClustersList();
  /**
   * <pre>
   * Clusters to report stats for.
   * </pre>
   *
   * <code>repeated string clusters = 1 [(.validate.rules) = { ... }</code>
   */
  int getClustersCount();
  /**
   * <pre>
   * Clusters to report stats for.
   * </pre>
   *
   * <code>repeated string clusters = 1 [(.validate.rules) = { ... }</code>
   */
  java.lang.String getClusters(int index);
  /**
   * <pre>
   * Clusters to report stats for.
   * </pre>
   *
   * <code>repeated string clusters = 1 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getClustersBytes(int index);

  /**
   * <pre>
   * The minimum interval of time to collect stats over. This is only a minimum for two reasons:
   * 1. There may be some delay from when the timer fires until stats sampling occurs.
   * 2. For clusters that were already feature in the previous *LoadStatsResponse*, any traffic
   *    that is observed in between the corresponding previous *LoadStatsRequest* and this
   *    *LoadStatsResponse* will also be accumulated and billed to the cluster. This avoids a period
   *    of inobservability that might otherwise exists between the messages. New clusters are not
   *    subject to this consideration.
   * </pre>
   *
   * <code>.google.protobuf.Duration load_reporting_interval = 2;</code>
   */
  boolean hasLoadReportingInterval();
  /**
   * <pre>
   * The minimum interval of time to collect stats over. This is only a minimum for two reasons:
   * 1. There may be some delay from when the timer fires until stats sampling occurs.
   * 2. For clusters that were already feature in the previous *LoadStatsResponse*, any traffic
   *    that is observed in between the corresponding previous *LoadStatsRequest* and this
   *    *LoadStatsResponse* will also be accumulated and billed to the cluster. This avoids a period
   *    of inobservability that might otherwise exists between the messages. New clusters are not
   *    subject to this consideration.
   * </pre>
   *
   * <code>.google.protobuf.Duration load_reporting_interval = 2;</code>
   */
  com.google.protobuf.Duration getLoadReportingInterval();
  /**
   * <pre>
   * The minimum interval of time to collect stats over. This is only a minimum for two reasons:
   * 1. There may be some delay from when the timer fires until stats sampling occurs.
   * 2. For clusters that were already feature in the previous *LoadStatsResponse*, any traffic
   *    that is observed in between the corresponding previous *LoadStatsRequest* and this
   *    *LoadStatsResponse* will also be accumulated and billed to the cluster. This avoids a period
   *    of inobservability that might otherwise exists between the messages. New clusters are not
   *    subject to this consideration.
   * </pre>
   *
   * <code>.google.protobuf.Duration load_reporting_interval = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getLoadReportingIntervalOrBuilder();

  /**
   * <pre>
   * Set to *true* if the management server supports endpoint granularity
   * report.
   * </pre>
   *
   * <code>bool report_endpoint_granularity = 3;</code>
   */
  boolean getReportEndpointGranularity();
}