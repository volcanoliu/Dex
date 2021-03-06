package com.dexvis.dex.task.vis.dexjs.multiples.c3

import org.simpleframework.xml.Root

import com.dexvis.dex.task.base.WebTask
import com.dexvis.util.TaskPropertyFactory

@Root
class C3DonutChartMultiples extends WebTask {
  public C3DonutChartMultiples() {
    super("Visualization: Dex JS", "C3 Donut Chart Multiples",
      "visualization/dexjs/multiples/c3/DonutChartMultiples.html",
      "web/dexjs/multiples/c3/DonutChartMultiples.gtmpl")
    
    setSaveDynamic(true)
  }
}
